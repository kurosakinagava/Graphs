import java.util.Scanner;
public class NumberOfEdges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the matrix
        int n = scanner.nextInt();

        // Read the adjacency matrix
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Count the number of edges
        int numEdges = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != 0) {
                    numEdges++;
                }
            }
        }

        // Output the number of edges
        System.out.println(numEdges);
    }
}
