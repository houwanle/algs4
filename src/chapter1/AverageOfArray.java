package chapter1;

/**
 * author: hwl
 * date: 2020/9/5 16:05
 * version: 1.0.0
 * modified by:
 * description: 计算数组元素的平均值
 */

public class AverageOfArray {

    public static void main(String[] args) {
        double arr[] = {1,2,3,4,5,6};
        System.out.println("数组元素的平均值为：" + averageOfArray(arr));
    }

    public static double averageOfArray(double arr[]) {
        int n = arr.length;
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double average = sum/n;
        return average;
    }
}
