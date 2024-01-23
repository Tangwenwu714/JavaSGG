package com.atguigu07.encapsulation.exer1;

/**
 * ClassName: PersonTest
 * Package: com.atguigu07.encapsulation.exer1
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/1/15 22:26
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.setAge(20);
        System.out.println(p1.getAge());
    }
}
