import java.util.PriorityQueue;

public class JobSequencingPriorityQueue {
    public static int maxCost(int arr[], int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int res = 0;
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            res = (res + first + second);
            pq.add(first + second);
        }
        return res;

    }

    public static void main(String[] args) {
        int job[] = { 4, 3, 5, 7 };
        int size = job.length;
        System.out.println("The Max Cost is :" + maxCost(job, size));
    }
}
