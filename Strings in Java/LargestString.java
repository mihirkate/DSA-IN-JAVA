public class LargestString {
    public static void main(String[] args) {
        String fruits[] = { "apple", "a", "mango", "banana", "kela", "zebra" };
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
            if (largest == null) {
                return;
            }
        }
        System.out.println(largest);
        String smallest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if (smallest.compareTo(fruits[fruits.length - 1]) > 0) {
                smallest = fruits[i];
            }

        }
        System.out.println(smallest);
    }
}
