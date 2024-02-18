package com.atguigu05._super.exer3;

/**
 * ClassName: AccountTest
 * Package: com.atguigu05._super.exer3
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/18 12:38
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account(1122,20000,0.045);

        acct.withdraw(30000);
        System.out.println("您的账户余额：" + acct.getBalance());

        acct.withdraw(2500);
        acct.deposit(3000);
        System.out.println("您的账户余额：" + acct.getBalance());

        System.out.println("月利率为" + acct.getMonthlyInterest());
    }
}
