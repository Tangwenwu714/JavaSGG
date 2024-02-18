package com.atguigu06.polymorphism.exer1;

/**
 * ClassName: GeometricObject
 * Package: com.atguigu06.polymorphism.exer1
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/18 16:21
 * @Version 1.0
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double findArea(){
        return 0.0;
    }
}
