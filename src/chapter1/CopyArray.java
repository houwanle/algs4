package chapter1;

/**
 * author: hwl
 * date: 2020/9/5 16:13
 * version: 1.0.0
 * modified by:
 * description:复制数组
 */

public class CopyArray {

    public static void main(String[] args) {
        double arr[] = {1,2,3,4,5,6};
        double arr1[] = copyArray(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    public static double[] copyArray(double arr[]) {
        int n = arr.length;
        double arr1[] = new double[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }
}
