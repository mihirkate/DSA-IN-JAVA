
public class RepetitionOf2DArray {
    public static void repeatationOf2DArray(int array[][]) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 8) {
                    count = count + 1;
                }
            }
        }
        System.out.println("8 is repeated " + count + " times");
    }

    public static void main(String[] args) {
        int[][] array = { { 4, 7, 8 }, { 8, 8, 7 } };
        repeatationOf2DArray(array);
    }
}
