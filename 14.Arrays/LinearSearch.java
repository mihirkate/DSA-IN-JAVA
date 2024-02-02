import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int arr[], int n, int target) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at this index :");
                return i;
            }
            System.out.println("Not found ");

        }
        return -1;
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

    public static int binarySearch(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                System.out.println("element found");
                return mid;
            }
            if (arr[mid] < target) {
                start = (mid + 1);

            } else {
                end = (mid - 1);
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

    public static int largestNo(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }

        }

        return largest;
    }

    public static int smallest(int arr[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 40, 20, 15 };
        int n = arr.length;
        int target = 40;

        System.out.println("The smallest element  is " + smallest(arr));
    }
}