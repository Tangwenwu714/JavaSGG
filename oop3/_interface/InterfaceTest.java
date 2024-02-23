package com.atguigu08._interface;

/**
 * ClassName: InterfaceTest
 * Package: com.atguigu08._interface
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/23 17:47
 * @Version 1.0
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MIN_SPEED);
        System.out.println(Flyable.MAX_SPEED);
    }
}
interface Flyable{ //接口
    // 全局常量
    public static final int MIN_SPEED = 0;

    // 可以省略 public static final\
    int MAX_SPEED = 7900;

    // 方法,可以省略 public abstract
    void fly();
}
interface Attcakable{
    void attack();
}
class Plane implements Flyable,Attcakable{

    @Override
    public void fly() {
        System.out.println("让子弹飞一会");
    }

    @Override
    public void attack() {
        System.out.println("击中了");
    }
}