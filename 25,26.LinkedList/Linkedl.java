import java.util.LinkedList;

public class Linkedl {
    public static void main(String[] args) {
        LinkedList<Integer> i = new LinkedList<>();
        i.addFirst(1);
        i.addLast(44);
        i.addFirst(2);
        i.addFirst(4);
        i.addFirst(5);
        System.out.println(i);
        i.remove();
        System.out.println(i);
        i.removeLast();
        System.out.println(i);
    }
}
