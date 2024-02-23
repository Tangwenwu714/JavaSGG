package com.atguigu08._interface.exer1;

/**
 * ClassName: Indian
 * Package: com.atguigu08._interface.exer1
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/23 21:32
 * @Version 1.0
 */
public class Indian implements Eateable{
    @Override
    public void eat() {
        System.out.println("Indian use hands");
    }
}
