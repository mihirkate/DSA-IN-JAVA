public class ZigZagLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;

    public void printLL() {
        Node temp = head;
        if (head == null) {
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void zigZag() {
        // find mid
        Node fast = head.next;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        // reverse ;
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        // alternate zigzagging
        Node nextL, nextR;
        while (left != null && right != null) {
            // alternate zigzagging
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            // update
            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[] args) {
        ZigZagLL l = new ZigZagLL();
        System.out.println();
        l.addFirst(0);
        l.addFirst(5);
        l.addFirst(17);
        l.addFirst(137);
        l.addFirst(7);
        l.printLL();
        l.zigZag();
        l.printLL();
    }
}
