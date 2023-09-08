package Arrays;

import java.util.Scanner;

public class Arrays {
    public static void array() {
        int marks[] = new int[20];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("phy :" + marks[0]);
        System.out.println("chem :" + marks[1]);
        System.out.println("Maths :" + marks[2]);
        System.out.println("the marks of lenght is " + marks.length);
    }

    public static int linearSearch() {
        int arr[] = { 1, 2, 3, 5, 6, 10 };
        int key = 20;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("key found at index No. " + i);
                return i;
            } else {
                System.out.println("key not found ");
                return -1;
            }
        }
        return -1;
    }

    public static int getlargestNo(int number[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        System.out.println("smallest is :" + smallest);
        return largest;
    }

    public static int binarySearch(int number[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter key :");
        int key = sc.nextInt();
        int start = 0, end = number.length - 1, mid;
        while (start <= end) {
            mid = (start + end) / 2;
            // comparisions
            if (number[mid] == key) {
                System.out.println("Key Found at " + mid);
                return mid;
            }
            if (number[mid] < key) {
                start = (mid + 1);
            } else {
                end = (mid - 1);
            }
        }
        return -1;
    }

    public static void reverseArray(int number[]) {
        int first = 0;
        int last = number.length - 1;
        while (first < last) {
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
        }
        System.out.println("Revered array is \n");
        for (int i = 0; i < number.length; i++) {
            System.out.print(" " + number[i]);
        }
    }

    public static void printPairs(int number[]) {
        int tp = 0;
        for (int i = 0; i < number.length; i++) {
            // int curr = i; // optional
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + number[i] + "," + number[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs are :" + tp);
    }

    public static void printSubArrays(int number[]) {
        int ts = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                // int total =number[i]+number[j];
                for (int k = i; k < j; k++) {// k is used only to print
                    System.out.print(number[k] + " " + "");
                }
                // System.out.print("the total: "+number[total]);
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub Arrays are :" + ts);
    }

    public static void printSubArraysSum(int number[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                // int total =number[i]+number[j];
                currsum = 0;
                for (int k = i; k <= j; k++) {// k is used only to print
                    currsum = currsum + number[k];
                }
                System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("max sum=" + maxsum);
    }

    public static void printSubArraysSumUsingPrefix(int number[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        // calculating prefix array
        prefix[0] = number[0];
        for (int i = 1; i < number.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }
        //
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                if (start == 0) {
                    currsum = prefix[end];
                } else {
                    currsum = prefix[end] - prefix[start - 1];
                }

                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("max sum=" + maxsum);
    }

    public static void kadaneAlgoOfSubArray(int number[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            cs = cs + number[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("max Sum (ms) is :" + ms);
        ms = Math.min(cs, ms);
    }

    public static void kadane(int number[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            cs = cs + number[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.min(cs, ms);
        }
        System.out.println("min Sum (ms) is :" + ms);
    }

    public static void main(String[] args) {
        // array();
         linearSearch();
        int number[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // getlargestNo(nu-mber);
        // System.out.println("largest is: " + getlargestNo(number));
         System.out.println(binarySearch(number));
        // reverseArray(number);
        // printPairs(number);
        // printSubArrays(number);
        // printSubArraysSum(number);
        // printSubArraysSumUsingPrefix(number);
        // kadaneAlgoOfSubArray( number);
        kadane(number);
    }
}
