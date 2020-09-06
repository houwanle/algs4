package chapter1;

/**
 * author: hwl
 * date: 2020/9/6 09:56
 * version: 1.0.0
 * modified by:
 * description: 计算调和级数
 */

public class H {

    public static void main(String[] args) {
        int n = 6;
        System.out.println(n + "的调和级数为：" + h(n));
    }

    private static double h(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0/i;
        }
        return sum;
    }
}
