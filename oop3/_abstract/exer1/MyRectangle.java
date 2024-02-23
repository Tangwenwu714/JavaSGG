package com.atguigu07._abstract.exer1;

/**
 * ClassName: MyRectangle
 * Package: com.atguigu06.polymorphism.exer1
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/18 16:28
 * @Version 1.0
 */
public class MyRectangle extends GeometricObject{
    private double width;
    private double height;

    public MyRectangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return width * height;
    }
}
