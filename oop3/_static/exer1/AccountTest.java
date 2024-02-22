package com.atguigu01._static.exer1;

/**
 * ClassName: AccountTest
 * Package: com.atguigu01._static.exer1
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/22 16:11
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acc1 = new Account();
        System.out.println(acc1);

        Account acc2 = new Account("123456",2000);
        System.out.println(acc2);

        Account.setInterestRate(0.0123);
        Account.setMinBalance(10);

        System.out.println(Account.getInterestRate());
        System.out.println(Account.getMinBalance());
    }
}
