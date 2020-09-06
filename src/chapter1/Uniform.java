package chapter1;

/**
 * author: hwl
 * date: 2020/9/7 06:26
 * version: 1.0.0
 * modified by:
 * description: 随机返回[a, b)之间的一个double值
 */

public class Uniform {

    public static void main(String[] args) {
        double a = 6.3;
        double b = 8.1;
        System.out.println(uniform(a, b));
    }

    private static double uniform(double a, double b) {
        return a + Math.random() * (b - a);
    }

}
