package com.atguigu08.constructor;

/**
 * ClassName: Person
 * Package: com.atguigu08.constructor
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/1/25 11:19
 * @Version 1.0
 */
public class Person {
    String name;
    int age;
    public void eat(){
        System.out.println("人吃软饭");
    }

    public void sleep(int hour) {
        System.out.println("每天睡眠"+ hour +"小时");;
    }
}
