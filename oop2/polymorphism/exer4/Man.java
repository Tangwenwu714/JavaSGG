package com.atguigu06.polymorphism.exer4;

/**
 * ClassName: Man
 * Package: com.atguigu06.polymorphism.exer4
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/18 17:12
 * @Version 1.0
 */
public class Man extends Person{
    @Override
    public void eat() {
        System.out.println("男人大口吃饭");;
    }

    @Override
    public void toilet() {
        System.out.println("男人去男厕所");
    }
    public void smoke(){
        System.out.println("厕后去抽烟");
    }
}
