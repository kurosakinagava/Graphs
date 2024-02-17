import java.util.Scanner;

public class AdjacencyMatrixGraph {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Size of the matrix

        int[][] matrix = new int[n][n];

        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Check if the matrix can be an adjacency matrix of a simple undirected graph
        if (isAdjacencyMatrix(matrix, n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isAdjacencyMatrix(int[][] matrix, int n) {
        // Check if the matrix is symmetric along the main diagonal
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }

        // Check if diagonal elements are all zeros
        for (int i = 0; i < n; i++) {
            if (matrix[i][i] != 0) {
                return false;
            }
        }

        // Check if there are no self-loops
        for (int i = 0; i < n; i++) {
            if (matrix[i][i] != 0) {
                return false;
            }
        }

        return true;
    }
}

