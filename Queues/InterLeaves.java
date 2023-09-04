import java.util.LinkedList;
import java.util.Queue;

public class InterLeaves {
    public static void interleaves(Queue<Integer> q) {
        /* calculate size and find first half and second halves */

        int size = q.size();
        /* Creation of New Queue */
        Queue<Integer> firstHalf = new LinkedList<>();
        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove());
        }
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }

    public static void print(Queue<Integer> q) {
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.remove(q));
        System.out.println(q);
        System.out.println(q.poll());

        System.out.println(q);
        /*
         * System.out.println("Before");
         * System.out.println(q);
         * System.out.println("Interleaves Of The Queue is ");
         * interleaves(q);
         * System.out.println("After");
         * System.out.println(q);
         */
    }
}
