package chapter1;

import java.util.*;

/**
 * author: hwl
 * date: 2020/9/3 07:10
 * version: 1.0.0
 * modified by:
 * description: 二分查找两类实现方式
 */

public class BinarySearch {

    private BinarySearch(){ }

    public static void main(String[] args) {
//        System.out.println("请输入");
//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine();
//        String[] arr = str.split(" ");
//
//        int[] arr1 = stringToInt(arr);
//
//        Arrays.sort(arr1);
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i] + " ");
//        }

        int arr[] = {1, 2, 3, 4, 5, 6};
//        System.out.println(commonBinarySearch(arr, 6));
        System.out.println(recursionBinarySearch(arr, 4, 0, 5));

    }

    /**
     * 二分查找：递归实现
     * @param arr
     * @param key
     * @param low
     * @param high
     * @return
     */
    public static int recursionBinarySearch(int[] arr, int key, int low, int high){
        if (key < arr[low] || key > arr[high] || low > high){
            return -1;
        }

        int middle = (low + high) / 2;
        if (arr[middle] > key) {
            return recursionBinarySearch(arr, key, low, middle - 1);
        } else if (arr[middle] < key) {
            return recursionBinarySearch(arr, key, middle + 1, high);
        } else {
            return middle;
        }
    }

    /**
     * 二分查找：非递归实现
     * @param arr
     * @param key
     * @return
     */
    public static int commonBinarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int middle = 0;

        if (key < arr[low] || key > arr[high] || low > high) {
            return -1;
        }

        while (low <= high) {
            middle = (low + high) / 2;
            if (arr[middle] > key) {
                high = middle - 1;
            } else if (arr[middle] < key) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    /**
     * 字符串数组转换为整型数组
     * @param args
     * @return
     */
    public static int[] stringToInt(String[] args) {
        int [] arr = new int[args.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        return arr;
    }


}
