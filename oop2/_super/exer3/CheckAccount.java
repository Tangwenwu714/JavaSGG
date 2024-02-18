package com.atguigu05._super.exer3;

/**
 * ClassName: CheckAccount
 * Package: com.atguigu05._super.exer3
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/18 13:35
 * @Version 1.0
 */
public class CheckAccount extends Account{
    private double overdraft; //可透支金额
    public CheckAccount(int id, double balance, double annualInterestRate){
        super(id, balance, annualInterestRate);
    }
    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft){
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    /**
     * 针对可透支账户的取钱操作
     * @param amount
     */
    public void withdraw(double amount){
        if (getBalance() >= amount){
            super.withdraw(amount);
        }else if (getBalance() + overdraft >= amount){
            overdraft -= amount - getBalance();
            super.withdraw(getBalance());
        }else {
            System.out.println("超过可透支限额");
        }
    }
}
