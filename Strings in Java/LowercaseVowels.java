import java.util.*;

public class LowercaseVowels {
    // vowels aeiou
    // count how many times the vowels comes in the entered string
    public static void vowels() {
        System.out.println("enter a string ");
        String str = new Scanner(System.in).next();
        int count = 0;
        for (char i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                count++;

            }
        }
        System.out.println("vowel is repeated :" + count);

    }

    public static void main(String[] args) {
        vowels();
    }
}
