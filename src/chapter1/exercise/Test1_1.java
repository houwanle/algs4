package chapter1.exercise;

import java.util.Scanner;

/**
 * author: hwl
 * date: 2020/9/12 12:58
 * version: 1.0.0
 * modified by:
 * description: 1.1节练习题
 */

public class Test1_1 {

    public static void main(String[] args) {
//        test1(); // 第一题
//        test2(); // 第二题
//        test3(); // 第三题
//        test4();  //第五题
//        test5();  //第六题
//        test6();  //第七a题
//        test7();  //第七b题
//        test8();  //第七c题
//        test9();  //第八题
//        test10();  //第九题
//        test11();  //第十一题
        test12();  //第十二题

    }

    private static void test12(){
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }

        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

//        for (int i = 0; i < 10; i++) {
//            System.out.println(a[i]);
//        }
    }

    private static void test11(){
        for (int i = 0; i < 6; i++) {
//            System.out.print(i);
            for (int j = 0; j < 6; j++){
                if (j < 3) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }

    }

    private static void test10(){
        String s = "";
        int N = 6;
        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
        System.out.println(s);
    }

    private static void test9(){
        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println((char)('a' + 4));
    }

    private static void test8(){
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    private static void test7(){
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    private static void test6(){
        double t = 9.0;
        while(Math.abs(t - 9.0/t) > .001) {
            t = (9.0/t + t) / 2.0;
        }
        System.out.printf("%.5f", t);
    }

    private static void test5(){
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++){
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }

    private static void test4(){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(",");
        double[] arr = new double[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Double.parseDouble(str[i]);
        }
        if (arr[0] > 0 && arr[0] < 1 && arr[1] > 0 && arr[1] < 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }

    private static void test3(){
        Scanner input = new Scanner(System.in);
        String[] str = input.nextLine().split(",");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        if (arr[0] == arr[1] && arr[1] == arr[2]) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    private static void test2() {
        System.out.println("(1 + 2.236) / 2 = " + (1 + 2.236) / 2);
        System.out.println("1 + 2 + 3 + 4.0 = " + (1 + 2 + 3 + 4.0));
        System.out.println("4.1 >= 4 " + (4.1 >= 4));
        System.out.println("1 + 2 + '3' = " + (1 + 2 + "3"));
    }


    private static void test1() {
        System.out.println("( 0 + 15 ) / 2 = " + ( 0 + 15 ) / 2);
        System.out.println("2.0e-6 * 100000000.1 = " + 2.0e-6 * 100000000.1);
        System.out.println("true && false || true && true = " + (true && false || true && true) );
    }
}
