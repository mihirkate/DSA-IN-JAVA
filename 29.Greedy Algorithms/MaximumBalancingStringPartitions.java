public class MaximumBalancingStringPartitions {
    public static int balanceString(String str) {
        int l = 0;
        int r = 0;
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'L') {
                /* ans++; */
                l++;
            } else if (str.charAt(i) == 'R') {
                /* ans++; */
                r++;
            }
            if (l == r) {
                ans++;
            }
        }
        System.out.println("L " + l);
        System.out.println("R " + r);
        return ans;
    }

    public static void main(String[] args) {
        String str = "LRRRRLLRLLRLL";
        System.out.println(balanceString(str));
    }
}
