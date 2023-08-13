public class IsArraySorted {

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            System.out.println("array is not sorted ");
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 7, 6 };
        System.out.println(isSorted(arr, 0));
    }
}
