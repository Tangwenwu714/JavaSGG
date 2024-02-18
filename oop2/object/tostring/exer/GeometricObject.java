package com.atguigu07.object.tostring.exer;

/**
 * ClassName: GeometricObject
 * Package: com.atguigu07.object.tostring.exer
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/18 21:47
 * @Version 1.0
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject(){
        color = "white";
        weight = 1.0;
    }

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
}
