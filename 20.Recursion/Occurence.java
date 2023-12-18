public class Occurence {

    public static int firstOccurence(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, i + 1, key);

    }

    public static int lastOccurence(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, i + 1, key);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void allOccurence(int arr[], int i, int key) {
        // base case
        if (i == arr.length) {
            return;
        }
        // kaam
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        // calling function
        allOccurence(arr, i + 1, key);
    }

    public static int power(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        // System.out.println("The key is at index:" + firstOccurence(arr, 0, 5));
        // System.out.println(lastOccurence(arr, 0, 4));
        // System.out.println(power(2, 10));
        allOccurence(arr, 0, 2);
    }
}
