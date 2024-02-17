import java.util.Scanner;
public class DegreesOfGraph {
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

        // Calculate degrees of vertices
        int[] degrees = new int[n];
        for (int i = 0; i < n; i++) {
            int degree = 0;
            for (int j = 0; j < n; j++) {
                degree += matrix[i][j];
            }
            degrees[i] = degree;
        }

        // Output the degrees of vertices
        for (int i = 0; i < n; i++) {
            System.out.print(degrees[i] + " ");
        }
    }
}
