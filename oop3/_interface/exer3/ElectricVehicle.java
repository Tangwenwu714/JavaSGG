package com.atguigu08._interface.exer3;

/**
 * ClassName: ElectricVehicle
 * Package: com.atguigu08._interface.exer3
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/24 0:09
 * @Version 1.0
 */
public class ElectricVehicle extends Vehicle implements IPower{
    public ElectricVehicle() {
    }

    public ElectricVehicle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("EV run through electric engine");
    }

    @Override
    public void power() {
        System.out.println("Electric");
    }
}
