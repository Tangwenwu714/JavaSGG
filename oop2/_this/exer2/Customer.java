package com.atguigu01._this.exer2;

/**
 * ClassName: Customer
 * Package: com.atguigu01._this.exer2
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/4 22:58
 * @Version 1.0
 */
public class Customer {
    private String firstName;
    private String lastName;

    private Account account;

    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
