import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {

    public static ArrayList<Integer> selectActivity(int start[], int end[], int n) {
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        maxAct = 1;

        int lastEnd = end[0];
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("Max Activites are : " + maxAct);
        System.out.println("Selected  Activites are  ");

        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();

        System.out.println("A" + ans);
        return ans;
    }

    public static int maxActivity(int start[], int end[], int n) {
        int maxAct = 0;
        int activites[][] = new int[start.length][3];
        ArrayList<Integer> ans = new ArrayList<>();
        // sorting
        for (int i = 0; i < activites.length; i++) {
            activites[i][0] = i;
            activites[i][1] = start[i];
            activites[i][2] = end[i];
        }
        Arrays.sort(activites, Comparator.comparingDouble(o -> o[2]));

        // main work
        ans.add(activites[0][0]);
        maxAct = 1;

        int lastEnd = activites[0][2];
        for (int i = 1; i < end.length; i++) {
            if (activites[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activites[i][0]);
                lastEnd = activites[i][2];
            }
        }
        System.out.println("Max Activites are : " + maxAct);
        System.out.println("Selected  Activites are  ");

        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        return maxAct;
    }

    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        // for soted ending time
        /* selectActivity(start, end, end.length); */
        System.out.println(maxActivity(start, end, end.length));
        // sorting

    }
}
