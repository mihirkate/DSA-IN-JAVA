class T {
    public void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void changeArray(int arr[], int idx, int val) {
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
}

public class TrackinArray {
    public static void main(String[] args) {
        T m = new T();
        int arr[] = new int[6];
        m.changeArray(arr, 0, 1);
        m.printarray(arr);
    }  
}