import java.util.jar.Attributes.Name;

public class DivideAndConquer {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        // kaam
        int mid = (si + ei) / 2;
        // int mid = si + (ei - si) / 2;
        // calling innerfunction
        mergeSort(arr, si, mid);// sortting for left
        mergeSort(arr, mid + 1, ei);// sortting for right
        // merging both left& right part
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;// temp array
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
                // i ko temp mei store kar dunga
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
            // k++;
        }
        // leeft over element
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // copy temp to orignal array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];

        }
    }

    public static void Name() {
        int n = 50, k = 5;
        for (int i = 0; i < n; i = i + k) {
            for (int j = i + 1; j <= k; j++) {
                System.out.print("i = " + i + " ");
                System.out.print("j= " + j + " ");
            }
        }
    }

    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 10, 2, 18, 1 };
        // System.out.println("before");
        // printArray(arr);
        mergeSort(arr, 0, arr.length - 1);
        // System.out.println("After ");
        // printArray(arr);
        // int a = 3;
        // int b = 2;
        // int c = (a + b) / 2;
        // System.out.println("addition is " + c);
        // Name();
        // System.out.println(power(2, 5));
        // int a=3;
        // System.out.println(a/2);
    }

}
