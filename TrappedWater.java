public class TrappedWater {
    public static int rainWater(int height[]) {
        int n = height.length;
        int width = 1;

        // calcluate left max boundary
        int leftmax[] = new int[n];
        leftmax[0] = height[0];// corner case 
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        // calcluate right max boundary
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];// corner case 
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        // loop ->min(left boundary,right boundary )
        int trapppedWater = 0;
        for (int i = 0; i < n; i++) {
            // waterlevel=(min(left boundary,right boundary )
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            // trappped water =trapped water+((waterlevel- height[i])*width)--> widh=1
            trapppedWater += waterlevel - height[i];
        }

        return trapppedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5,7,8 };
        System.out.println("Trapped water is :" + rainWater(height)+" cu Litrs");
    }
}
