
public class Mihir {
    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void changeArray(int arr[], int idx, int val) {
        if (idx == arr.length) {
            printarray(arr);
            return;
        }
        // recursion
        arr[idx]=val;
        changeArray(arr, idx + 1, val + 1);
        // backtracking
        arr[idx] = arr[idx] - 2;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArray(arr, 0, 1);
        printarray(arr);
    }
}