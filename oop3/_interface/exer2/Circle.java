package com.atguigu08._interface.exer2;

/**
 * ClassName: Circle
 * Package: com.atguigu08._interface.exer2
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/23 21:40
 * @Version 1.0
 */
public class Circle {
    private double radius; // 半径

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
