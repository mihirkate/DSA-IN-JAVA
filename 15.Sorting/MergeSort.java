public class MergeSort {
    public static void mergeSortDec(int arr[], int si, int ei) {

        // bse case
        if (si >= ei) {
            return;
        }
        int mid = (si + ei) / 2;
        mergeSortDec(arr, si, mid);
        mergeSortDec(arr, mid + 1, ei);
        mergearray(arr, si, mid, ei);

    }

    public static void mergearray(int arr[], int si, int mid, int ei) {
        int i = si;
        int j = mid + 1;
        int k = 0;
        int temp[] = new int[ei - si + 1];
        while (i <= mid && j <= ei) {
            if (arr[i] > arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        // left
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // right
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // copy array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 9, 20, 40, 10, 25, 27 };
        printArray(arr);
        mergeSortDec(arr, 0, arr.length-1);
        printArray(arr);
    }

}
