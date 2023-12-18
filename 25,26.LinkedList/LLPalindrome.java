
public class LLPalindrome {

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

    public void printLL() {
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

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome() {
        // base case
        if (head == null || head.next == null) {
            return true;
        }
        // find mid
        Node minNode = findMid(head);
        // reverse the linledlist
        Node prev = null;
        Node curr = minNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // left and right half
        Node right = prev;
        Node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;

    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean flag = false;
        // detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            // meet
            if (fast == slow) {
                flag = true;
                break;

            }
        }
        if (flag == false) {
            return;
        }

        // meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // remove cycle
        prev.next = null;

    }

    public static void main(String[] args) {
        LLPalindrome l = new LLPalindrome();
        // l.addFirst(3);
        // l.addFirst(2);
        l.addFirst(2);
        // l.addFirst(3);
        // l.print();

        // if (l.checkPalindrome() == true) {
        // System.out.println("Linked list is Palindrome");
        // } else {
        // System.out.println("Linked list is Not Palindrome");
        // }
        // System.out.println("The size of LL " + size);
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
