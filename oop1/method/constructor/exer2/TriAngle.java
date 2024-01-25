package com.atguigu08.constructor.exer2;

/**
 * ClassName: TriAngle
 * Package: com.atguigu08.constructor.exer2
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/1/25 16:28
 * @Version 1.0
 */
public class TriAngle {
    private double base;
    private double height;

    public double getBase(){
        return base;
    }
    public void setBase(double b){
        base = b;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double h){
        height = h;
    }

    // Constructor
    public TriAngle(){

    }
    public TriAngle(double b,double h){
        base = b;
        height = h;
    }

    public double findArea(){
        return base * height/2;
    }
}
