import java.text.Annotation;

class Animal {
    void walk() {
        System.out.println("I am Walking");
    }
}

class Birds extends Animal {
    void fly() {
        System.out.println("I am Flying ");
    }

    void sing() {
        System.out.println("I am  Singing ");
    }
}

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Birds b = new Birds();
        b.walk();
        b.fly();
        b.sing();
    }
}
