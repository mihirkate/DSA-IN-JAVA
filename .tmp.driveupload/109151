import java.util.ArrayList;
import java.util.HashSet;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        int uniqueCount = 0;
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        // union
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
            uniqueCount++;
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
            uniqueCount++;
        }
        System.out.println("The elements which are unique" + set);
        System.out.println("Total elements " + set.size());

        // intersection
        set.clear();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
            uniqueCount++;
        }
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                count++;
                set.remove(arr2[i]);
            }
        }
        System.out.println("The set is " + set);
        System.out.println("The count is " + count);

    }
}
