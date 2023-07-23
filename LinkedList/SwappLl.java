import java.util.*;

public class SwappLl {
    public static Node head;
    public static Node tail;
    public static int size = 0;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    };

    public void swap(int x, int y) {
        if (x == y) {
            return;
        }
        // serch x
        Node prevX = null;
        Node currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }
        Node prevY = null;
        Node currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }
        if (currX == null || currY == null) {
            return;
        }
        // when x is head of LL

        if (prevX != null)
            prevX.next = currY;
        else // make y the new head
            head = currY;

        // If y is not head of linked list
        if (prevY != null)
            prevY.next = currX;
        else // make x the new head
            head = currX;
        // swapping
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;

    }

    public void addFirstDll(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printLL() {
        Node temp = head;
        if (head == null) {
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " --->  ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        SwappLl s = new SwappLl();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of LL");
        int n = sc.nextInt();
        System.out.println("enter linked list");
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            s.addFirstDll(a);
        }

        System.out.print("Before Swapping The Linkedlist:   ");
        s.printLL();
        System.out.println("enter The Number to be swapped ");
        int c = sc.nextInt();
        int d = sc.nextInt();
        s.swap(c, d);
        System.out.println();
        System.out.print("After Swapping The Linkedlist:   ");
        s.printLL();
        System.out.println();
    }
}
