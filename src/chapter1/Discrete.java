package chapter1;

/**
 * author: hwl
 * date: 2020/9/8 06:19
 * version: 1.0.0
 * modified by:
 * description: 根据离散概率随机返回的int值（出现i的概率为a[i])
 */

public class Discrete {

    public static void main(String[] args) {
        double a[] = {0.1,0.5,0.2,0.2};
        System.out.println(discrete(a));
    }

    private static int discrete(double[] a) {
        // a[]中各元素之和必须等于1
        double r = Math.random();
        double sum = 0.0;
        for (int i = 0; i <= a.length; i++) {
            sum = sum + a[i];
            if (sum >= r) {
                return i;
            }
        }
        return -1;
    }

}
