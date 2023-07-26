import java.util.Stack;

public class Histogram {

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
        System.out.println("Max Area of The Histogram is :-  " + maxArea);
    }

    public static void main(String[] args) {

        int arr[] = { 2, 1, 5, 6, 2, 3 };
        maxHistogram(arr);
    }
}
