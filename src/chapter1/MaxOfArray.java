package chapter1;

/**
 * author: hwl
 * date: 2020/9/4 06:52
 * version: 1.0.0
 * modified by:
 * description: 找出数组中最大或最小的元素
 */

public class MaxOfArray {

    public static void main(String[] args) {
        double[] arr = {0.5,23,34,6,78,99.1,1};
        System.out.println(maxOfArray(arr));
        System.out.println(minOfArray(arr));
    }

    public static double maxOfArray(double arr[]) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double minOfArray(double arr[]) {
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
