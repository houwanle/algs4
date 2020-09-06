package chapter1;

/**
 * author: hwl
 * date: 2020/9/6 09:32
 * version: 1.0.0
 * modified by:
 * description: 计算平方根（牛顿迭代法）
 */

public class Sqrt {

    public static void main(String[] args) {
        double a = 8;
        double b = 9;
        System.out.println("a的平方根为：" + sqrt(a));
        System.out.println("b的平方根为：" + sqrt(b));
    }

    public static double sqrt(double c) {
        if (c < 0) {
            return Double.NaN;
        }
        double err = 1e-15;
        double t = c;
        while(Math.abs(t - c/t) > err * t) {
            t = (c/t + t) / 2.0;
        }
        return t;
    }
}
