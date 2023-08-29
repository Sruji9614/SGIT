//DFS AND BFS TREES
import java.util.*;
class Graph {
    private int V;
    private LinkedList<Integer>[] adjList;
    @SuppressWarnings("unchecked")
    public Graph(int vertices) 
    {
        V = vertices;
        adjList = new LinkedList[V];
        for (int i = 0; i < V; i++) 
        {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest) 
    {
        adjList[src].add(dest);
    }

    public void DFS(int startVertex) 
    {
        boolean[] visited = new boolean[V];
        DFSUtil(startVertex, visited);
    }

    private void DFSUtil(int vertex, boolean[] visited) 
    {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int neighbor : adjList[vertex]) 
        {
            if (!visited[neighbor]) 
            {
                DFSUtil(neighbor, visited);
            }
        }
    }

    public void BFS(int startVertex) 
    {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) 
        {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int neighbor : adjList[vertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);

        System.out.println("DFS starting from vertex 0:");
        graph.DFS(0);
        System.out.println();

        System.out.println("BFS starting from vertex 0:");
        graph.BFS(0);
    }
}
