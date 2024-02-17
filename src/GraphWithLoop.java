import java.util.Scanner;
public class GraphWithLoop {
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

        // Check for loops in the adjacency matrix
        boolean containsLoop = false;
        for (int i = 0; i < n; i++) {
            if (matrix[i][i] == 1) {
                containsLoop = true;
                break;
            }
        }

        // Output the result
        if (containsLoop) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
