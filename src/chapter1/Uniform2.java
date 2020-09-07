package chapter1;

/**
 * author: hwl
 * date: 2020/9/7 20:27
 * version: 1.0.0
 * modified by:
 * description: 随机返回[lo, hi)之间的一个int值
 */

public class Uniform2 {

    public static void main(String[] args) {
        int lo = 1;
        int hi = 9;
        System.out.println(uniform(lo, hi));
    }

    private static int uniform(int lo, int hi) {
        return lo + (int)(Math.random() * (hi - lo));
    }
}
