package com.scorpio.iperator;

/**
 * @ClassName OperatorDemo7
 * @Description TODO
 * @Author Scorpio
 * @Date 2022/7/13 22:29
 * @Version 1.0
 */

public class OperatorDemo8 {
    public static void main(String[] args) {
        //目标：学会使用三元运算符，并理解其流程
        double score = 100;
        String rs = score >= 60 ? "tongguo" : "guake";
        System.out.println(rs);

        //需求：从两个整数中找出较大值
        int a = 10000;
        int b = 30;
        int max = a > b ? a : b;
        System.out.println("较大值为：" + max);
    }
}
