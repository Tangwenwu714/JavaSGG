package com.atguigu08._interface.exer3;

/**
 * ClassName: Vehicle
 * Package: com.atguigu08._interface.exer3
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/24 0:06
 * @Version 1.0
 */
public abstract class Vehicle {
    private String brand;
    private String color;

    public Vehicle() {
    }

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void run();
}
