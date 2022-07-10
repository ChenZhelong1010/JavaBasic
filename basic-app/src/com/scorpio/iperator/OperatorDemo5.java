package com.scorpio.iperator;

/**
 * @ClassName OperatorDemo5
 * @Description TODO
 * @Author Scorpio
 * @Date 2022/7/10 16:15
 * @Version 1.0
 */

public class OperatorDemo5 {
    public static void main(String[] args) {
        //目标：学会使用自增自减符
        int a = 10;
        a++; //a = a+1
        System.out.println(a);

        ++a; //a = a+1
        System.out.println(a);

        int b = 10;
        b--; //b = b-1
        System.out.println(b);

        --b;
        System.out.println(b);

        System.out.println("========================================");

        //在表达式中或不是单独操作的情况下，++和--的区别。
        int i = 10;
        int j = ++i;
        System.out.println(i);
        System.out.println(j);

        int m = 10;
        int n = m++;
        System.out.println(m);
        System.out.println(n);

        System.out.println("====================拓展案例====================");

        int k = 3;
        int p = 5;
        int rs = k++ + ++k - --p + p-- - k-- + ++p + 2;
        System.out.println(rs);
    }

}
