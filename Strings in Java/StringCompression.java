public class StringCompression {
    public static String compression(String str) {
        StringBuilder newstr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                i++;
                count++;
            }
            // newstr += str.charAt(i);
            
            newstr.append(str.charAt(i));
            if (count > 1) {
                // newstr = newstr + count.toString();
                newstr.append(count.toString(i));
            }
        }
        return newstr.toString();
    }
   

    public static void main(String[] args) {
        String str = "aabbccddaa";
        System.out.println(compression(str));
    }
}