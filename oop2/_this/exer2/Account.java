package com.atguigu01._this.exer2;

/**
 * ClassName: Account
 * Package: com.atguigu01._this.exer2
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/4 22:55
 * @Version 1.0
 */
public class Account {
    private double balance;

    public Account(double init_balance) {
        this.balance = init_balance;

    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amt){
        if (amt > 0){
            balance += amt;
            System.out.println("成功存入" + amt);
        }
    }

    public void withdraw(double amt){
        if (balance >= amt && amt > 0){
            balance -= amt;
            System.out.println("成功取出" + amt);
        }else {
            System.out.println("取款数额有误或余额不足");
        }
    }
}
