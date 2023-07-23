public class DeleteNodes {
    public static Node head;
    public static Node tail;
    public static int size = 0;

    public static class Node {
        int data;
        Node next;
    };

    static Node push(Node head_ref, int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = (head_ref);
        (head_ref) = new_node;
        return head_ref;
    }

    static void printLL(Node head) {
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

    static void skipNode(Node head, int M, int N) {
        Node curr = head, t;
        int count;
        while (curr != null) {

            for (count = 1; count < M && curr != null; count++) {
                curr = curr.next;
            }
            if (curr == null) {
                return;
            }
            t = curr.next;

            for (count = 1; count <= N && t != null; count++) {
                Node temp = t;
                t = t.next;
            }
            curr.next = t;
            curr = t;

        }
    }

    public static void main(String[] args) {
        int M = 2, N = 2;
        System.out.println("\nBefore Deletion");
        Node head = null;
        head = push(head, 1);
        head = push(head, 2);
        head = push(head, 3);
        head = push(head, 4);
        head = push(head, 5);
        head = push(head, 6);

        printLL(head);
        System.out.println("\nAfter  Deletion");
        skipNode(head, M, N);
        printLL(head);
    }
}
