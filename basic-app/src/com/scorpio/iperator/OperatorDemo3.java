package com.scorpio.iperator;

/**
 * @ClassName OperatorDemo2
 * @Description TODO
 * @Author Scorpio
 * @Date 2022/7/10 16:15
 * @Version 1.0
 */

public class OperatorDemo3 {
    public static void main(String[] args) {
        //目标：+符号做连接符的识别
        int a = 5;
        System.out.println("abc" + 'a');
        System.out.println("abc" + a);
        System.out.println(5 + a);
        System.out.println("abc" + 5 + 'a');
        System.out.println(a + 'a');
        System.out.println(a + " " + 'a');
        System.out.println(a + 'a' + "scorpio");
        System.out.println("scorpio" + a + 'a');
        System.out.println("scorpio" + (a + 'a'));
    }
}
