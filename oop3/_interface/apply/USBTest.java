package com.atguigu08._interface.apply;

/**
 * ClassName: USBTest
 * Package: com.atguigu08._interface.apply
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/23 20:43
 * @Version 1.0
 */
public class USBTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Printer printer = new Printer();

        computer.transferData(printer);

        // 方法2
        USB usb1 = new USB() {
            @Override
            public void start() {
                System.out.println("Usb start working");
            }

            @Override
            public void stop() {
                System.out.println("Usb stop working");
            }
        };
        computer.transferData(usb1);

        // 方法3
        computer.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("Scanner start");
            }

            @Override
            public void stop() {
                System.out.println("Scanner stop");
            }
        });
    }

}
class Computer{
    public void transferData(USB usb){
        System.out.println("Connect success");
        usb.start();

        System.out.println("Performing");
        usb.stop();
    }
}

class Printer implements USB{
    @Override
    public void start() {
        System.out.println("Printer start");
    }

    @Override
    public void stop() {
        System.out.println("Printer stop");
    }
}

interface USB{
    // 常量

    // 方法
    public abstract void start();
    void stop();
}
