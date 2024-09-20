import java.util.*;
public class MaxSumHourGlass {
    public static int maxSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows < 3 || cols < 3) {
            return 0; // The matrix should have at least 3x3 size for hourglass
        }

        int maxSum = Integer.MIN_VALUE;

        // Traverse each potential top-left corner of an hourglass
        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < cols - 2; j++) {
                int sum = 0; // Reset sum for the current hourglass
                // Top row of hourglass
                sum += matrix[i][j] + matrix[i][j+1] + matrix[i][j+2];
                // Middle of hourglass
                sum += matrix[i+1][j+1];
                // Bottom row of hourglass
                sum += matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];
                
                // Update maxSum if the current hourglass sum is larger
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println(maxSum(matrix));
        sc.close(); // Close the scanner to avoid resource leaks
    }
}
