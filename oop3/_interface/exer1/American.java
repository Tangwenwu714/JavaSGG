package com.atguigu08._interface.exer1;

/**
 * ClassName: American
 * Package: com.atguigu08._interface.exer1
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/23 21:32
 * @Version 1.0
 */
public class American implements Eateable{
    @Override
    public void eat() {
        System.out.println("American use forks");
    }
}
