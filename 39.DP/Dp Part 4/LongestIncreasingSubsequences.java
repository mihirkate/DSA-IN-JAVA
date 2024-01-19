import java.util.Arrays;
import java.util.HashSet;

public class LongestIncreasingSubsequences {
    public static int lcs(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        int dp[][] = new int[n + 1][m + 1];
        int ans = 0;
        // initialiation
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < m + 1; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (arr1[i - 1] == arr2[j - 1]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];

                } else {
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j - 1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }

    public static int longestIncreasingSubsequences(int arr1[]) {
        // main task
        // 1. Create sorted +unique Hashset
        // 2. Create Hash set and add all the eklements present in the array 1
        // 3. Sort array2
        // 4. find LCS betwwen array1 and array2
        // using hashset woulld be better as it will store
        // Only Unique Elements
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            h.add(arr1[i]);
        }
        int arr2[] = new int[h.size()];
        int i = 0;
        for (int num : h) {
            arr2[i] = num;
            i++;
        }
        Arrays.sort(arr2);
        print(arr1);
        print(arr2);
        return lcs(arr1, arr2);
    }

    public static void print(int dp[]) {
        for (int i = 0; i < dp.length; i++) {
            {
                System.out.print(dp[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 50, 3, 10, 7, 40, 80 };
        System.out.println(" The Longest increasing subsequence is : " +
                longestIncreasingSubsequences(arr));

    }
}
