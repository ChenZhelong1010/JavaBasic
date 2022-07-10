package com.scorpio.iperator;

/**
 * @ClassName OperatorDemo2
 * @Description TODO
 * @Author Scorpio
 * @Date 2022/7/10 16:15
 * @Version 1.0
 */

public class OperatorDemo2 {
    public static void main(String[] args) {
        //需求：拆分三位数，把个十百分别输出。
        int data = 589;

        //1、个位
        int gewei = data%10;
        System.out.println(data % 10);

        //2、十位
        int shiwei = data/10%10;
        System.out.println(data / 10 % 10);

        //3、百位
        int baiwei = data/100;
        System.out.println(data / 100);


    }
}
