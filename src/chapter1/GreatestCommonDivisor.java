package chapter1;

/**
 * author: hwl
 * date: 2020/9/3 06:36
 * version: 1.0.0
 * modified by:
 */

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.print("最大公约数为：" + gcd(20,8));
    }

    /**
     * 欧几里得算法：
     * 计算两个非负整数p和q的最大公约数：若q是0，则最大公约数为p。
     * 否则，将p除以q得到余数r，p和q的最大公约数即为q和r的最大公约数。
     * @param p
     * @param q
     * @return
     */
    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }
}
