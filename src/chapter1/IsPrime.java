package chapter1;

/**
 * author: hwl
 * date: 2020/9/6 09:07
 * version: 1.0.0
 * modified by:
 * description: 判断一个数是否是素数
 */

public class IsPrime {

    public static void main(String[] args) {
        int a = 12;
        int b = 17;
        System.out.println("a是素数：" + isPrime(a));
        System.out.println("b是素数：" + isPrime(b));
    }

    public static boolean isPrime(double num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
