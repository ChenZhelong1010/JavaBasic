package com.itheima;

/**
 * @ClassName TypeDemo1
 * @Description TODO
 * @Author Chen Zhelong
 * @Date 2022/7/10 15:24
 * @Version 1.0
 */

public class TypeDemo1 {
    public static void main(String[] args) {
        //目标：自动类型转换
        byte a = 20;
        int b = a; //发生了自动类型转换
        System.out.println(a);
        System.out.println(b);

        int age = 23;
        double db = age;//自动类型转换
        System.out.println(db);

        char ch = 'a'; //在阿斯科码表中，a=97
        int code = ch; //自动类型转换
        System.out.println(code);

    }
}
