public class OddEvenLL {
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

    public void oddEven() {
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;
        while (even.next != null && even != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;

        }
        odd.next = evenHead;

    }

    void segregateEvenOdd() {
        Node end = head;
        Node prev = null;
        Node curr = head;
        while (end.next != null)
            end = end.next;
        Node new_end = end;
        while (curr.data % 2 != 0 && curr != end) {
            new_end.next = curr;
            curr = curr.next;
            new_end.next.next = null;
            new_end = new_end.next;
        }
        if (curr.data % 2 == 0) {
            head = curr;
            while (curr != end) {
                if (curr.data % 2 == 0) {
                    prev = curr;
                    curr = curr.next;
                } else {
                    prev.next = curr.next;
                    curr.next = null;
                    new_end.next = curr;
                }
            }
        }
    }

    public Node oddEven2() {
        Node oddH = null;
        Node oddT = null;
        Node evenH = null;
        Node evenT = null;
        Node curr = head;
        while (curr != null) {
            if (curr.data % 2 != 0) {
                // check if its first element pointing towards null
                if (oddH == null) {
                    oddH = oddT = curr;

                } else {
                    oddT.next = curr;
                    oddT = oddT.next;
                }
            } else if (evenH == null) {
                evenH = evenT = curr;
            } else {
                evenT.next = curr;
                evenT = evenT.next;
            }
            curr = curr.next;
            if (oddH == null) {
                return evenH;
            } else {
                oddT.next = evenH;
            }
            if (evenH != null) {
                evenT.next = null;
            }
            return oddH;
        }
        return null;
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
        OddEvenLL s = new OddEvenLL();
        s.addFirstDll(8);
        s.addFirstDll(7);
        s.addFirstDll(6);
        s.addFirstDll(5);
        s.addFirstDll(4);
        s.addFirstDll(2);
        s.printLL();
        s.segregateEvenOdd();
        s.printLL();

    }
}
