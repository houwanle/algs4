package chapter1;

/**
 * author: hwl
 * date: 2020/9/6 08:50
 * version: 1.0.0
 * modified by:
 * description: 绝对值函数
 */

public class AbsoluteValue {

    public static void main(String[] args) {
        double num = -66.2;
        System.out.println(absoluteValue(num));
    }

    public static double absoluteValue(double num) {
        if (num < 0) {
            return -num;
        } else {
            return num;
        }
    }
}
