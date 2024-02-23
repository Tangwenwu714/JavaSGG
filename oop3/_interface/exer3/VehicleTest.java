package com.atguigu08._interface.exer3;

/**
 * ClassName: VehicleTest
 * Package: com.atguigu08._interface.exer3
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/24 0:14
 * @Version 1.0
 */
public class VehicleTest {
    public static void main(String[] args) {
        Developer developer = new Developer();

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Bicycle("Jieante", "red");
        vehicles[1] = new ElectricVehicle("Yadi","blue");
        vehicles[2] = new Car("Benz","black","A1231");

        for (int i = 0; i < vehicles.length; i++) {
            developer.takingVehicle(vehicles[i]);
        }
    }
}
