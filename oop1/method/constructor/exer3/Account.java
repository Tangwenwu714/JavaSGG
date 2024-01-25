package com.atguigu08.constructor.exer3;

/**
 * ClassName: Account
 * Package: com.atguigu08.constructor.exer3
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/1/25 16:40
 * @Version 1.0
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    public Account(int i,double b,double a){
        id = 1;
        balance = b;
        annualInterestRate = a;
    }
    public void  setId(int i){
        id = 1;
    }
    public int getId(){
        return id;
    }
    public void setBalance(double b){
        balance = b;
    }
    public double getBalance(){
        return balance;
    }
    public void setAnnualInterestRate(double a){
        annualInterestRate = a;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void withdraw(double amount){
        if (amount <= balance){
            balance -= amount;
            System.out.println("成功取出");
        }else {
            System.out.println("余额不足，取款失败");
        }
    }
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("成功存入：" + amount);
        }
    }

}
