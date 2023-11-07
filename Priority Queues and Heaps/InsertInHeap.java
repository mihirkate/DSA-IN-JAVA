import java.util.*;

public class InsertInHeap {
    static class Heap {
        ArrayList<Integer> al = new ArrayList<>();

        public void add(int data) {
            // add at last
            al.add(data);
            int child = al.size() - 1;// child index
            int par = (child - 1) / 2;// parent index
            while (al.get(child) < al.get(par)) {
                // swap(child, par);
                int temp = al.get(child);
                al.set(child, al.get(par));
                al.set(par, al.get(temp));
                child = par;
                par = (child - 1) / 2;
            }

        }

        public int peek() {
            if (al.isEmpty()) {
                return -1;
            }
            return al.get(0);
        }

        private void heapify(int idx) {
            int left = (2 * idx) + 1;
            int right = (2 * idx) + 2;
            int min = idx;
            if (left < al.size() && al.get(min) > al.get(left)) {
                min = left;
            }
            if (right < al.size() && al.get(min) > al.get(right)) {
                min = right;
            }
            if (min != idx) {
                // swap
                int temp = al.get(idx);
                al.set(idx, al.get(min));
                al.set(min, temp);
                heapify(min);
            }

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

        public boolean isEmpty() {
            return al.size() == 0;
        }

    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.delete();
        }
    }
}