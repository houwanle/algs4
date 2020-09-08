package chapter1;

/**
 * author: hwl
 * date: 2020/9/9 06:55
 * version: 1.0.0
 * modified by:
 * description: 随机将double数组中的元素排序
 */

public class Shuffle {

    public static void main(String[] args) {
        double[] arr = {1.2,34.2,2.1,45.6,66.1,2.5};
        shuffle(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void shuffle(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            // 将a[i]和a[i..n-1]中任意一个元素交换
            int r = i + (int)(Math.random() * (n - i));
            double temp = arr[i];
            arr[i] = arr[r];
            arr[r] = temp;
        }
    }
}
