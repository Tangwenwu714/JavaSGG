package com.atguigu07.object.tostring.exer;

/**
 * ClassName: CircleTest
 * Package: com.atguigu07.object.tostring.exer
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/18 22:20
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.3);
        Circle c2 = new Circle("red",2.0,3.4);

        System.out.println(c1.getColor().equals(c2.getColor()));

        System.out.println(c1.equals(c2));
        System.out.println(c1.toString());
    }
}
