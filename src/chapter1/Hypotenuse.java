package chapter1;

/**
 * author: hwl
 * date: 2020/9/6 09:49
 * version: 1.0.0
 * modified by:
 * description: 计算直角三角形的斜边
 */

public class Hypotenuse {

    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        System.out.println("直角三角形的斜边长为：" + hypotenuse(a, b));
    }

    private static double hypotenuse(double a, double b) {
        return Math.sqrt(a*a + b*b);
    }
}
