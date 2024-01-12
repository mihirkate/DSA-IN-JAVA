import java.util.ArrayList;

public class ArticulationPoint {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;

        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    public static void dfs(ArrayList<Edge> graph[], int curr,
            int par, int[] dt, int[] low, int time, boolean[] vist, boolean ap[]) {
        // O(V+E)
        vist[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            int neigh = e.dest;

            // case 1
            if (par == neigh) {
                // ignore
                continue;
            } else if (vist[neigh]) {
                low[curr] = Math.min(low[curr], dt[neigh]);
            } else {
                // if neigh is not visited then call dfs for it
                dfs(graph, neigh, curr, dt, low, time, vist, ap);
                low[curr] = Math.min(low[curr], low[neigh]);
                // Backtracking
                // check for Articulation Point in dfs
                if (par != -1 && dt[curr] <= low[neigh]) {// articulation point exist s
                    ap[curr] = true;
                    /* System.out.println("Articulation point:  " + curr); */
                }
                children++;
            }
        }
        // case 1
        if (par == -1 && children > 1) {
            ap[curr] = true;
            /* System.out.println("Articulation point:  " + curr); */
        }
    }

    public static void getAp(ArrayList<Edge> graph[], int v) {
        int dt[] = new int[v];
        int low[] = new int[v];
        int time = 0;
        boolean vist[] = new boolean[v];
        boolean ap[] = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!vist[i]) {
                dfs(graph, i, -1, dt, low, time, vist, ap);
            }

        }
        // print all the articulation point
        for (int i = 0; i < v; i++) {
            if (ap[i]) {
                System.out.println("Ap :" + i);
            }

        }
        System.out.println();

    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        getAp(graph, v);
    }
}
