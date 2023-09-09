import java.util.Arrays;

public class MinAbsoluteDifference {
    public static int minDifference(int a[], int b[]) {
        int minDiff = 0;
        // sorting
        Arrays.sort(a);
        Arrays.sort(b);

        // display A and B array
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.print(" " + b[i]);
        }
        System.out.println();

        // Main Work of finding absolute difference pair
        for (int i = 0; i < a.length; i++) {
            minDiff = minDiff + Math.abs(a[i] - b[i]);
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int A[] = { 4, 1, 8, 7, };
        int B[] = { 2, 3, 6, 5 };
        System.out.println("The Minimum absloute difference of all pairs is " + minDifference(A, B));
    }
}
