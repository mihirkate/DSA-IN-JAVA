public class Twosum {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }

    public static int[] getData() {
        int a = 0, b = 1, c = 2, d = 4;
        return new int[] { a, b, c, d };
    }

    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };
        System.out.println(twoSum(nums, 9));
        System.out.println(getData());
    }
}

// class Solution {
// public int[] twoSum(int[] nums, int target) {
// for (int i = 0; i < nums.length; i++) {
// for (int j = i + 1; j < nums.length; j++) {
// if (nums[j] == target - nums[i]) {
// return new int[] { i, j };
// }
// }
// }
// // In case there is no solution, we'll just return null
// return null;
// }
// public static void printArray(int arr[]){
// for( int i=0;i<arr.length;i++){
// System.out.print(" "+arr[i]);
// }
// }
// }
// public class Java{
// public static void main(String args []){
// Solution sc=new Solution();
// int arr[]={2,7,11,15};
// sc. printArray(arr);
// sc.twoSum(arr,9);
// }
// }


