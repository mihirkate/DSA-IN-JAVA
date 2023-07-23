

public class Sorting {
    public static void bubbleSort(int arr[]) {
        System.out.println("befor array was: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        for (int turn = 0; turn < arr.length; turn++) {
            for (int j = 0; j < arr.length - turn - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("\nBubble sorted is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void selectionSort(Integer arr[]) {
        System.out.println("befor array was: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos =i;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[minpos] < arr[j]) {
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
        System.out.println("after");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }

    }

    public static void insertionSort(int arr[]) {

    }

    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 1, 3, 2, 6, };
        // bubbleSort(arr);
        
        selectionSort(arr);
      
}
}
