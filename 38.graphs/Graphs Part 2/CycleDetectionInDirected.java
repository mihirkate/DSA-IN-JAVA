import java.util.ArrayList;

public class CycleDetectionInDirected {
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
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));

    }

    public static boolean isCycle(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (isCycleUtil(graph, vis, i, stack)) {
                    return true;
                }
                ;
            }

        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge> graph[],
            boolean vis[], int curr, boolean stack[]) {
        vis[curr] = true;
        stack[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            // finding neighbour
            Edge e = graph[curr].get(i);
            // check if the nnode exist in the stack
            // if exist then there is cycle exist
            if (stack[e.dest]) {
                // cycle exist
                return true;
            } else if (!vis[e.dest] && isCycleUtil(graph, vis, e.dest, stack)) {
                return true;
            }

        }
        stack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        System.out.println(isCycle(graph));
    }
}