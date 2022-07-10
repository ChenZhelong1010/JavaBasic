package com.scorpio.type;

/**
 * @ClassName TypeDemo3
 * @Description TODO
 * @Author Scorpio
 * @Date 2022/7/10 15:24
 * @Version 1.0
 */

public class TypeDemo3 {
    public static void main(String[] args) {
        //目标：理解强转并使用。
        int a = 20;
        byte b = (byte) a;
        System.out.println(a);
        System.out.println(b);

        int i = 1500;
        byte j = (byte) i;
        System.out.println(j);

        double s = 99.5;
        int it = (int) s;
        System.out.println(it);

    }
}
