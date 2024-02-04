package com.atguigu01._this.exer1;

/**
 * ClassName: BoyGirlTest
 * Package: com.atguigu01._this.exer1
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/4 22:50
 * @Version 1.0
 */
public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy1 = new Boy("Jack",25);
        Girl girl1 = new Girl("Julia",23);

        girl1.marry(boy1);
        boy1.shout();

        Girl girl2 = new Girl("Rose",18);
        int compare = girl1.compare(girl2);
        System.out.println(compare);
    }
}
