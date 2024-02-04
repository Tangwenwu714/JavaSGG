package com.atguigu01._this.exer2;

/**
 * ClassName: BankTest
 * Package: com.atguigu01._this.exer2
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/4 23:07
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("Jack","Ma");
        bank.addCustomer("Pony","Ma");

        bank.getCustomer(0).setAccount(new Account(100));
        bank.getCustomer(0).getAccount().withdraw(50);

        System.out.println("账户余额" + bank.getCustomer(0).getAccount().getBalance());
    }
}
