package chapter1;

/**
 * author: hwl
 * date: 2020/9/7 20:15
 * version: 1.0.0
 * modified by:
 * description: 随机返回[0, N)之间的一个int值
 */

public class Uniform1 {

    public static void main(String[] args) {
        int N = 6;
        System.out.println(uniform(N));
    }

    private static int uniform(int n) {
        return (int)(Math.random() * n);
    }
}
