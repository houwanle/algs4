package chapter1;

/**
 * author: hwl
 * date: 2020/9/10 06:37
 * version: 1.0.0
 * modified by:
 * description: 输出内容格式化
 */

public class RandomSeq {

    String[] args = { "3", "1", "2"};

    public static void main(String[] args) {

        String[] arr = {"5","100.0","200.0"};

        // 打印N个(lo, hi)之间的随机值
        int N = Integer.parseInt(arr[0]);
        double lo = Double.parseDouble(arr[1]);
        double hi = Double.parseDouble(arr[2]);
        for (int i = 0; i < N; i++) {
            double x = lo + Math.random() * (hi - lo);
            System.out.printf("%.2f\n", x);
        }
    }
}
