import java.util.Stack;
import java.util.*;

public class NextGreaterElement {

    public static long[] nextLargerElement(long[] arr, int n) {
        Stack<Long> s = new Stack<>();

        long nextgrt[] = new long[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextgrt[i] = -1;
            } else {
                nextgrt[i] = s.peek();
            }
            s.push(arr[i]);
        }
        return nextgrt;

    }

    public static int[] nextLargerElement(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();

        int nextgrt[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextgrt[i] = -1;
            } else {
                nextgrt[i] = s.peek();
            }
            s.push(arr[i]);
        }
        return nextgrt;
    }

    public static void nextGreaterElement(int arr[]) {

    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t " + arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // Stack<Integer> s = new Stack<>();
        // System.out.println("\n\tFind the next greater element in the right Using
        // Stacks");
        int arr[] = { 7, 8, 10, 0, -1, };
        // print(arr);
        // int nextGrt[] = new int[arr.length];

        // // finding the next great element in the right
        // for (int i = arr.length - 1; i >= 0; i--) {
        // while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
        // s.pop();
        // }
        // if (s.isEmpty()) {
        // nextGrt[i] = -1;
        // } else {
        // nextGrt[i] = arr[s.peek()];

        // }
        // s.push(i);
        // }

        // // print

        // System.out.println("\n\tThe Next greater elements to the right are :\n");
        // for (int i = 0; i < nextGrt.length; i++) {
        // System.out.print("\t " + nextGrt[i]);
        // }
        // System.out.println();
        System.out.println(nextLargerElement(arr, 5));
    }
}
