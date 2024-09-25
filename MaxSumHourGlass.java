import java.util.*;
public class MaxSumHourGlass {
    public static int maxSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows < 3 || cols < 3) {
            return 0;
        }

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < cols - 2; j++) {
                int sum = 0; 
                sum += matrix[i][j] + matrix[i][j+1] + matrix[i][j+2];
                sum += matrix[i+1][j+1];
                sum += matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];
                
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
        sc.close();
    }
}
