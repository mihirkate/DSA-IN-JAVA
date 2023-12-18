public class IntersectionLL {

    public static Node head;
    public static Node tail;
    public static int size = 0;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;

        }
    };

    public Node getIntersection(Node head1, Node head2) {
        while (head2 != null) {
            Node temp = head1;
            while (temp != null) {
                if (temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }

    public static void main(String[] args) {
        IntersectionLL l = new IntersectionLL();
        Node head1, head2;
        head1 = new Node(10);
        head2 = new Node(3);

        Node newNode = new Node(6);
        head2.next = newNode;

        newNode = new Node(9);
        head2.next.next = newNode;

        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;

        newNode = new Node(30);
        head1.next.next = newNode;

        head1.next.next.next = new Node(17);

        head1.next.next.next = null;
        // these is our linkedlist
        // 10->15
        //
        // 3->6->9->15-17
        Node IP = l.getIntersection(head1, head2);
        if (IP == null) {
            System.out.println("Intersection Not occured");
        } else {
            System.out.println("Intersection Occuresd At :" + IP.data);
        }
    }
}