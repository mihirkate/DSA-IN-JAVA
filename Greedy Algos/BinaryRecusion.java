public class BinaryRecusion {

    public static int binaryRecusion(int arr[], int si, int ei, int key) {
        int mid = si + (ei - si) / 2;

        // base case
        if (si >= ei) {
            return -1;
        }
        // if element found at middle 
        if (key == arr[mid]) {
            return mid;
        }
        if (key < mid) {
            return binaryRecusion(arr, si, mid - 1, key);
        }
        if (key > mid) {
            return binaryRecusion(arr, mid + 1, ei, key);
        }

        return -1;
    } 
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5,8,10,45, 40 };
        int key = 10;
        int f = binaryRecusion(arr, 0, arr.length - 1, 10);
        printArray(arr);
        System.out.println("the target is "+key);
        if (f == -1) {
            System.out.println("element not found");
        }
        else{
            System.out.println("elemt found at index "+ f+" in the binary search array ");
        }
        System.out.println();

    }
}
