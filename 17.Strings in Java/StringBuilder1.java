public class StringBuilder1 {
    public static String stringUpperCase(String str) {
        StringBuilder sb = new StringBuilder();

        // ITNA SIRF FIRST LETTER
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        // SECOND LETTERS KE LIYE KAAM SURU

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(stringUpperCase("hello world "));

    }
}
