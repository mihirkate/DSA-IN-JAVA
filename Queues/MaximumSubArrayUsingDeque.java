import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MaximumSubArrayUsingDeque {
    public static int[] maxofall(int arr[], int k) {
        int ans[] = new int[arr.length];
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (dq.size() > 0 && arr[i] > dq.peek()) {
                dq.removeLast();
            }
            dq.add(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
