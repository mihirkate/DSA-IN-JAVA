import java.util.ArrayList;
import java.util.Collections;

public class JobSequencing {
    static class Job {
        int id;
        int profit;
        int deadline;

        Job(int i, int d, int p) {
            this.id = i;
            this.profit = p;
            this.deadline = d;
        }

        public static void jobSequencing(int jobsInfo[][]) {
            ArrayList<Job> jobs = new ArrayList<>();
            for (int i = 0; i < jobsInfo.length; i++) {
                jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
            }
            // sorting
            Collections.sort(jobs, (a, b) -> b.profit - a.profit);
            ArrayList<Integer> ans = new ArrayList<>();
            int time = 0;
            for (int i = 0; i < jobs.size(); i++) {
                Job curr = jobs.get(i);
                if (curr.deadline > time) {
                    ans.add(curr.id);
                    time++;
                }
            }
            // print the anser
            System.out.println("Max Job can be done is " + ans.size());
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(" J" + ans.get(i));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        Job j = new Job(1, 2, 4);
        j.jobSequencing(jobsInfo);

    }
}
