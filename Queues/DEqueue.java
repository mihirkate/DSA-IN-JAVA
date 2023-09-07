import java.util.Deque;
import java.util.LinkedList;

public class DEqueue {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(1);
        d.addFirst(2);
        d.addFirst(3);
        System.out.println(d);
        d.remove(2);
        System.out.println(d);
        d.removeLast();
        System.out.println(d);
        d.addLast(6);
        d.addFirst(4);
        System.out.println("Peek last " + d.peekLast());
        System.out.println(d);
        System.out.println(d.getFirst());
        System.out.println(d.getLast());

    }
}
