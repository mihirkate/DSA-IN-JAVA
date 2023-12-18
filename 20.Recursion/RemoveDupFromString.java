
public class RemoveDupFromString {
    public static void removeDupsFrmString(String str, int idx, StringBuilder newstr, boolean map[]) {
        if (idx == str.length()) {// base Case
            System.out.println(newstr);
            return;
        }
        // kaam
        char currchar = str.charAt(idx);
        if (map[currchar - 'a'] == true) {
            // duplicate exist
            removeDupsFrmString(str, idx + 1, newstr, map);
        } else {
            map[currchar - 'a'] = true;
            removeDupsFrmString(str, idx + 1, newstr.append(currchar), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDupsFrmString(str, 0, new StringBuilder(" "), new boolean[26]);

    }
}
