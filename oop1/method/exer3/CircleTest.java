package com.atguigu04.example.exer3;

/**
 * ClassName: CircleTest
 * Package: com.atguigu04.example.exer3
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2023/12/22 12:04
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.radius = 2.3;
        c1.findArea();

        // 错误方法
        c1.findArea1(2.3);
    }
}
