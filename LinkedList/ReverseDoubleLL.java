public class ReverseDoubleLL {
    public static Node head;
    public static Node tail;
    public static int size = 0;

    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void printDll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<-->");
            temp = temp.next;
        }
        System.out.println(" Null");
    }

    public void addFirstDll(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void reverseDll() {
        // Imp function for Reversing a Doubly LinkedList
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        ReverseDoubleLL dll = new ReverseDoubleLL();
        dll.addFirstDll(3);
        dll.addFirstDll(6);
        dll.addFirstDll(5);
        dll.addFirstDll(8);
        dll.printDll();
        dll.reverseDll();
        dll.printDll();
    }
}
