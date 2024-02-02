import java.util.*;

public class InsertInHeap {
    static class Heap {
        ArrayList<Integer> al = new ArrayList<>();

        public void add(int data) {// O(logn)
            // add at last
            al.add(data);

            int x = al.size() - 1;// child index
            int par = (x - 1) / 2;// parent index
            while (al.get(x) < al.get(par)) {
                // swap(child, par);
                int temp = al.get(x);
                al.set(x, al.get(par));
                al.set(par, temp);
                x = par;
                par = (x - 1) / 2;
            }

        }

        public int peek() {
            return al.get(0);
        }

        public int delete() {
            int data = al.get(0);

            // step 1 - swap first and Last
            int temp = al.get(0);
            al.set(0, al.get(al.size() - 1));
            al.set(al.size() - 1, temp);

            // setp 2- delete the last index
            al.remove(al.size() - 1);

            // step 3 - Heapify
            heapify(0);
            return data;
        }

        public void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int min = i;
            if (left < al.size() && al.get(min) > al.get(left)) {
                min = left;
            }
            if (right < al.size() && al.get(min) > al.get(right)) {
                min = right;
            }
            if (min != i) {
                // swap
                int temp = al.get(i);
                al.set(i, al.get(min));
                al.set(min, temp);
                heapify(min);
            }

        }

        public boolean isEmpty() {
            return al.size() == 0;
        }

    }

    public static void main(String[] args) {
        Heap h = new Heap();
        /* h.add(2); */
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.print(" " + h.peek());
            h.delete();
        }

    }
}