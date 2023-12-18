public class BackTrackingInArrays {
    public static void changInArray(int arr[], int idx, int val) {
        // base case
        if (idx == arr.length) {
            printarray(arr);
            return;
        }
        arr[idx] = val;
        changInArray(arr, idx + 1, val + 1);
        // backtracking
        // changInArray(arr, idx - 1, val - 2);
        arr[idx] = arr[idx] - 2;
    }

    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changInArray(arr, 0, 1);
        printarray(arr);
    }
}
