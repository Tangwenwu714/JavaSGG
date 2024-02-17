package com.atguigu03._extends.exer2;

/**
 * ClassName: Circle
 * Package: com.atguigu03._extends.exer2
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/17 17:41
 * @Version 1.0
 */
public class Circle {
    private double radius;
    public Circle(){
        this.radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return 3.14 * radius * radius;
    }
}
