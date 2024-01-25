package com.atguigu08.constructor.exer2;

/**
 * ClassName: TriangleTest
 * Package: com.atguigu08.constructor.exer2
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/1/25 16:35
 * @Version 1.0
 */
public class TriangleTest {
    public static void main(String[] args) {
        TriAngle t1 = new TriAngle();

        t1.setBase(2.4);
        t1.setHeight(1.5);

        System.out.println(t1.findArea());

        // 实例2
        TriAngle t2 = new TriAngle(2.4,1.5);
        System.out.println(t2.getBase());
        System.out.println(t2.getHeight());
        t2.findArea();
    }
}
