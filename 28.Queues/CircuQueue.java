public class CircuQueue {
    static int size;
    static int rear;
    static int arr[];
    static int front;

    CircuQueue(int data) {
        arr = new int[data];
        size = data;
        rear = -1;
        front = -1;
    }

    public static boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public static boolean isFull() {
        return (rear + 1) % size == front;
    }

    public static void add(int data) {
        if (isFull()) {
            return;
        }
        // add first Element
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    public static int remove() {
        if (isEmpty()) {
            return -1;
        }
        int result = arr[front];
        front = (front + 1) % size;
        if (rear == front) {
            rear = front = -1;
        } else {
            front = (front + 1) % size;
        }
        return result;
    }

    public static int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {
        CircuQueue cq = new CircuQueue(3);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.add(5);
        while (!isEmpty()) {
            System.out.println(" " + peek());
            remove();
        }
    }
}
