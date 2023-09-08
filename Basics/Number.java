package Basics;
import java.util.*;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int num = sc.nextInt();
        int sum = 0;
        int val = 1;
        while (val <= num) {
            sum = sum + val;
            val = val + 1;
        }
        System.out.println("the sum is :" + sum);
    }

}