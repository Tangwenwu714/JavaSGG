package com.atguigu03._extends.exer2;

/**
 * ClassName: Cylinder
 * Package: com.atguigu03._extends.exer2
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/17 19:52
 * @Version 1.0
 */
public class Cylinder extends Circle{
    private double length;
    public Cylinder(){
        length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double findVolume(){
//        return 3.14 * getRadius() * getRadius() * getLength();
        return findArea() * getLength();
    }
}
