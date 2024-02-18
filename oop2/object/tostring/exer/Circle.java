package com.atguigu07.object.tostring.exer;

/**
 * ClassName: Circle
 * Package: com.atguigu07.object.tostring.exer
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/18 21:48
 * @Version 1.0
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
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

    //重写equals()
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj instanceof Circle){
            Circle c = (Circle) obj;
            return this.radius == c.radius;
        }
        return false;
    }

    //重写toString()

    @Override
    public String toString() {
        return "Circle[radius = " + radius + "]";
    }
}
