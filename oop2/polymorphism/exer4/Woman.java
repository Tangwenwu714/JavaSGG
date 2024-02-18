package com.atguigu06.polymorphism.exer4;

/**
 * ClassName: Woman
 * Package: com.atguigu06.polymorphism.exer4
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/18 17:54
 * @Version 1.0
 */
public class Woman extends Person{
    @Override
    public void eat() {
        System.out.println("女人小口吃饭");
    }

    @Override
    public void toilet() {
        System.out.println("女人去女厕所");;
    }
    public void makeup(){
        System.out.println("厕后去补妆");
    }
}
