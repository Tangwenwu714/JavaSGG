package com.atguigu08.constructor.exer3;

/**
 * ClassName: CustomerTest
 * Package: com.atguigu08.constructor.exer3
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/1/25 17:16
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane","Smith");

        Account account = new Account(1000,2000,0.0123);
        customer.setAccount(account);
        // 或者
        customer.setAccount(new Account(1000,2000,0.0123));

        //针对客户的账户进行取钱、存钱的操作
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);

        /*
        关于匿名对象
         */
        new Account(1001,2000,0.0123).withdraw(1000);
        // 只能使用一次，之后无法再次调用

    }
}
