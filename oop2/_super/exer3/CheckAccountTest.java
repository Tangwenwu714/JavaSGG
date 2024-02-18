package com.atguigu05._super.exer3;

/**
 * ClassName: CheckAccountTest
 * Package: com.atguigu05._super.exer3
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/18 13:50
 * @Version 1.0
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(1122,20000,0.045,5000);

        checkAccount.withdraw(5000);
        System.out.println("您的账户余额" + checkAccount.getBalance());
        System.out.println("可透支余额" + checkAccount.getOverdraft());

        checkAccount.withdraw(18000);
        System.out.println("您的账户余额" + checkAccount.getBalance());
        System.out.println("可透支余额" + checkAccount.getOverdraft());

        checkAccount.withdraw(3000);
        System.out.println("您的账户余额" + checkAccount.getBalance());
        System.out.println("可透支余额" + checkAccount.getOverdraft());

    }
}
