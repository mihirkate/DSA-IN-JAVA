import java.util.Stack;
import java.util.Scanner;

public class Histogram {
    public static long getMaxArea(long hist[], long n) {
        long nsl[] = new long[hist.length];
        long nsr[] = new long[hist.length];
        long maxArea = 0;
        Stack<Integer> s = new Stack<>();
        // next smaller right
        for (long i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && hist[s.peek()] >= hist[(int) i]) { // Convert 'i' to int using typecast
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[(int) i] = (int) hist.length;
            } else {
                nsr[(int) i] = (int) s.peek();
            }
            s.push((int) i);
        }
        s = new Stack<>();
        // next smaller left
        for (long i = 0; i < n; i++) {
            while (!s.isEmpty() && hist[s.peek()] >= hist[(int) i]) { // Convert 'i' to int using typecast
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[(int) i] = -1;
            } else {
                nsl[(int) i] = s.peek();
            }
            s.push((int) i);
        }

        // max area
        for (long i = 0; i < n; i++) {
            long height = hist[(int) i];
            long width = nsr[(int) i] - nsl[(int) i] - 1;
            long currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        return maxArea;
    }

    public static void maxHistogram(int arr[]) {
        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];
        int maxArea = 0;
        // next smaller right
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // next smaller left
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        /*
         * max area
         * area=height*widhth
         * width=j-i-1;
         */
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int widhth = nsr[i] - nsl[i] - 1;
            int curArea = height * widhth;
            maxArea = Math.max(curArea, maxArea);

        }

        System.out.println("\tMax Area of The Histogram is :-  " + maxArea);
    }

    public static void print(int arr[]) {
        System.out.println("\tThe Elements entered are ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i] + "");
        }
        System.out.println("\n\tAnd ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        int arr[] = { 2, 1, 5, 6, 3 };
        System.out.println("\n\tCode To Largest rectangle in The HistoGram ");
        System.out.println();
        print(arr);
        maxHistogram(arr);
        System.out.println();
    }
}
