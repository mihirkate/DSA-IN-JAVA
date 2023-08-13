package Recursion;
public class NumberToString {

    // questions from The assignments
    // find all occurence of the array

    public static void numberToString(int i, int n) {
        String arr[] = { "zero", "one", "two", "Three", "four", "five", "six", "seven", "eight", "nine", "ten" };

        // base
        if (n == 0) {
            return;
        }
        // kaam
        i = n % 10;
        numberToString(i, n / 10);
        System.out.print(" " + arr[i]);
    }

    public static void main(String[] args) {

        numberToString(0, 4567);

    }
}
