package sorting;
public class insertion {
    public static void insertionSort(int arr[], int n) {

        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && curr < arr[prev]) { // swap
                arr[prev + 1] = arr[prev];
                prev--;
            }
            System.out.println( "prev:"+prev);
            arr[prev + 1] = curr;
            System.out.println("curr"+curr);
        }
    }

    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
        // int n = sizeof(arr) / sizeof(arr[0]);
        int n=arr.length;
        printArray(arr, n);
        insertionSort(arr, n);
        printArray(arr, n);

    }
}
