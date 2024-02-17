import java.util.Scanner;
public class NumberOfVertices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of vertices and the given vertex
        int n = scanner.nextInt();
        int s = scanner.nextInt();

        // Read the adjacency matrix
        int[][] adjacencyMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adjacencyMatrix[i][j] = scanner.nextInt();
            }
        }

        // Initialize visited array to keep track of visited vertices
        boolean[] visited = new boolean[n];

        // Perform depth-first search starting from the given vertex
        dfs(adjacencyMatrix, visited, s - 1);

        // Count the number of vertices visited during DFS
        int count = 0;
        for (boolean vertexVisited : visited) {
            if (vertexVisited) {
                count++;
            }
        }

        // Output the number of vertices
        System.out.println(count);
    }

    // Depth-First Search (DFS) function
    private static void dfs(int[][] adjacencyMatrix, boolean[] visited, int vertex) {
        visited[vertex] = true; // Mark the current vertex as visited

        // Traverse all adjacent vertices of the current vertex
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            if (adjacencyMatrix[vertex][i] == 1 && !visited[i]) {
                dfs(adjacencyMatrix, visited, i); // Recursive call for unvisited adjacent vertices
            }
        }
    }
}
