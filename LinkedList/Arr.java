import java.util.Map;
import java.util.HashMap;

public class Arr {
    public static int[] getSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            int j = i + 1;
            if (arr[i] + arr[j] == target) {
                return i;
            }
        }
    }

    public static void main(String[] args) {

    }

}
