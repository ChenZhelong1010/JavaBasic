package com.scorpio.iperator;

/**
 * @ClassName OperatorDemo7
 * @Description TODO
 * @Author Scorpio
 * @Date 2022/7/13 22:29
 * @Version 1.0
 */

public class OperatorDemo7 {
    public static void main(String[] args) {
        //目标：学会使用逻辑运算符
        double size = 9.8;
        double storage = 16;
        //需求：尺寸大于等于6.95，内存大于等于8GB。
        //逻辑与：必须前后都是真，才是真。
        System.out.println(size >= 6.95 & size >= 8);

        //需求：要么内存大于等于8GB，要么尺寸大于等于6.95
        //只要有一个是真，结果就是真。
        System.out.println(size >= 6.95 | size >= 8);

        System.out.println(!true);
        System.out.println(!false);

        //逻辑异或：必须两个不同，结果才为真
        System.out.println(false ^ true);//true

        System.out.println("--------------&&和||的区别---------------");

        int a = 10;
        int b = 20;
        System.out.println(a > 100 && ++b > 10);
        System.out.println(b);

        System.out.println(a > 100 || ++b > 10);
        System.out.println(b);

    }
}
