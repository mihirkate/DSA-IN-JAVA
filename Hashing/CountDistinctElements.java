import java.util.*;
import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int nums[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        System.out.println("ans: " + set.size());
    }
}
