package chapter1;

/**
 * author: hwl
 * date: 2020/9/5 16:46
 * version: 1.0.0
 * modified by:
 * description: 矩阵相乘（方阵）
 */

public class MatrixMultiplication {

    public static void main(String[] args) {
        double a[][] = {{1,2},{3,4}};
        double b[][] = {{1,1},{2,2}};
        double c[][] = MatrixMultiplication(a, b);
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] MatrixMultiplication (double a[][], double b[][]) {
        int n = a.length;
        double c[][] = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 计算行i和列j的点乘
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
}
