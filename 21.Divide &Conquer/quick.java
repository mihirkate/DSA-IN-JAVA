public class quick {

    public static int parttion(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                // swap
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
            
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pIdx = parttion(arr, si, ei);
        quickSort(arr, si, pIdx - 1);
        quickSort(arr, pIdx + 1, ei);

    }
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 10, 50, 20, 15 };
        printArray(arr);
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
