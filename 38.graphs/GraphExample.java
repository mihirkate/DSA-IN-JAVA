import java.util.ArrayList;

public class GraphExample {
    static ArrayList<Edge> graph[];

    public static void main(String[] args) {
        int numVertices = 5;
        graph = new ArrayList[numVertices];

        for (int i = 0; i < numVertices; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges to the graph
        addEdge(0, 1, 2);
        addEdge(0, 2, 4);
        addEdge(1, 2, 1);
        addEdge(1, 3, 7);
        addEdge(2, 4, 3);
        addEdge(3, 4, 1);

        // Print the graph
        printGraph();
    }

    static void addEdge(int src, int dest, int wt) {
        Edge edge = new Edge(src, dest, wt);
        graph[src].add(edge);
        // For an undirected graph, you might want to add the reverse edge as well
        // graph[dest].add(new Edge(dest, src, wt));
    }

    static void printGraph() {
        for (int i = 0; i < graph.length; i++) {
            System.out.print("Vertex " + i + ": ");
            for (Edge edge : graph[i]) {
                System.out.print("(" + edge.src + "->" + edge.dest + ", wt=" + edge.wt + ") ");
            }
            System.out.println();
        }
    }

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
}
