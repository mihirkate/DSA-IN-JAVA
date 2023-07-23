
public class MergeTestStringArray {

    public static String[] mergeSort(String[] array) {
        String[] sorted = new String[array.length];
        if (array.length == 1) {
            sorted = array;
        } else {
            int mid = array.length / 2;
            String[] left = null;
            String[] right = null;
            if ((array.length % 2) == 0) {
                left = new String[array.length / 2];
                right = new String[array.length / 2];
            } else {
                left = new String[array.length / 2];
                right = new String[(array.length / 2) + 1];
            }
            int x = 0;
            int y = 0;
            for (; x < mid; x++) {
                left[x] = array[x];
            }
            for (; x < array.length; x++) {
                right[y++] = array[x];
            }
            left = mergeSort(left);
            right = mergeSort(right);
            sorted = mergeArray(left, right);
        }

        return sorted;
    }

    private static String[] mergeArray(String[] left, String[] right) {
        String[] merged = new String[left.length + right.length];
        int lIndex = 0;
        int rIndex = 0;
        int mIndex = 0;
        int comp = 0;
        while (lIndex < left.length || rIndex < right.length) {
            if (lIndex == left.length) {
                merged[mIndex++] = right[rIndex++];
            } else if (rIndex == right.length) {
                merged[mIndex++] = left[lIndex++];
            } else {
                comp = left[lIndex].compareTo(right[rIndex]);
                if (comp > 0) {
                    merged[mIndex++] = right[rIndex++];
                } else if (comp < 0) {
                    merged[mIndex++] = left[lIndex++];
                } else {
                    merged[mIndex++] = left[lIndex++];
                }
            }
        }
        return merged;
    }



    public static void printArray(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String[] array = { "John", "Anthony", "Angelina",
                "George", "Victor", "Joe", "Jackson","Mihir" };
        printArray(array);
        String[] sortedArray = mergeSort(array);
        System.out.println("after ");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }

    }
}