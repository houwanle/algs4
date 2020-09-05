package chapter1;

/**
 * author: hwl
 * date: 2020/9/5 16:26
 * version: 1.0.0
 * modified by:
 * description: 颠倒数组元素的顺序
 */

public class ReverseOrderOfArray {

    public static void main(String[] args) {
        double[] arr = {1,2,3,4,5,6,7,8,9};
        double[] arr1 = reverseOrderOfArray(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    public static double[] reverseOrderOfArray(double arr[]) {
        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            double temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        return arr;
    }
}
