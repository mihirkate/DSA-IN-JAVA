import java.util.*;

public class Strings {
    public static void main(String[] args) {
        System.out.println("he");
        Scanner sc = new Scanner(System.in);
        // String s=sc.next();
        // System.out.println(s);
        // String s1 = sc.nextLine();
        // System.out.println(s1);
        // System.out.println("lentgh :" + s1.length());
        // String lastname = "Kate";
        // String firstname = "Mihir";
        // String fullname = firstname + " " + lastname;
        // System.out.println(fullname);
        System.out.println( palindrome("nitin"));

    }

    public static boolean palindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                // nit palindrome
                return false;
            }
        }
        return true;
    }
}