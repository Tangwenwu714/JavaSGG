package com.atguigu04.block.exer;

/**
 * ClassName: UserTest
 * Package: com.atguigu04.block.exer
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/22 20:23
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.getInfo());

        User u2 = new User("Tom","12352");
        System.out.println(u2.getInfo());

        User1 u3 = new User1();
        System.out.println(u3.getInfo());

    }
}
