package Searching;
public class SearchingInRotatedArray {
    public static int linSearch(int arr[], int key) {
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Found at index:" + i);
                return i;
            } else {
                return -1;
            }
        }
        return -1;
    }

    public static int modifiedLinearSearch(int arr[], int target, int si, int ei) {
        // base case
        if(si>=ei){
            return -1;
        }
        // kaam 
        int mid = (si + ei) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        // line 1
        if (arr[si] <= arr[mid]) {
            // case a:line 1 ka left
            if (arr[si] <= target && target <= arr[mid]) {
                return modifiedLinearSearch(arr, target, si, mid - 1);
            } else {
                // case b-> loine 1 ka right
                return modifiedLinearSearch(arr, target, mid + 1, ei);
            }

        }
        // lin 2
        else {
            // line2 ka right
            if (arr[mid] <= target && target <= arr[ei]) {
                return modifiedLinearSearch(arr, target, mid + 1, ei);
            } else {
                // line 2 ka left
                return modifiedLinearSearch(arr, target, si, mid - 1);
            }

        }
        
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 ,9};
        int target = 7;// output-->4
        int taridx=modifiedLinearSearch(arr, target, 0, arr.length-1);
        System.out.println(" the target "+target+" is at index:"+taridx);
    }
}
