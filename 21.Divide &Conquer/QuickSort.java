public class QuickSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // putting pivot at right place
        i++;
        // // swap;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }
    
    public static void quickSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        // Pivot is Our Laste elemet

        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1);// left
        quickSort(arr, pIdx + 1, ei);// right part
    }
    public static void main(String[] args) {
        int arr[] = { 1, 8, 4, 9, 5,4 };
        printArray(arr);
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
