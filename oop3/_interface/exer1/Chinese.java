package com.atguigu08._interface.exer1;

/**
 * ClassName: Chinese
 * Package: com.atguigu08._interface.exer1
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/23 21:31
 * @Version 1.0
 */
public class Chinese implements Eateable{
    @Override
    public void eat() {
        System.out.println("Chinese use chopsticks");
    }
}
