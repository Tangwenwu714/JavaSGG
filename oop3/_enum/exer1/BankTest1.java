package com.atguigu10._enum.exer1;

/**
 * ClassName: BankTest1
 * Package: com.atguigu10._enum.exer1
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/25 17:42
 * @Version 1.0
 */
public class BankTest1 {
    public static void main(String[] args) {
        System.out.println(GirlFriend.XIAOLI);
    }
}

class Bank1{
    private Bank1(){
    }

    public static final Bank1 instance = new Bank1();

}

enum Bank2{
    CPB;
}
enum GirlFriend{
    XIAOLI(20);

    private final int age;

    private GirlFriend(int age){
        this.age = age;
    }
}