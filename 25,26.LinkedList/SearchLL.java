public class SearchLL {

    public static Node head;
    public static Node tail;
    public static int size = 0;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int searchInLL(int key) {
        int i = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Found at index " + i);

            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // creaate a node
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        if (head == null) {

            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public int helper(Node head, int key) {
        // base case
        if (head == null) {
            return -1;

        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recursiveSrch(int key) {
        return helper(head, key);
    }

    public void reverse()// O(n)
    {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        SearchLL l = new SearchLL();
        l.addFirst(1);
        l.addFirst(2);
        l.addFirst(0);
        l.addFirst(7);
        l.addFirst(1);
        l.print();

        l.reverse();
        l.print();
    }
}