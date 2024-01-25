package com.atguigu08.constructor.exer3;

/**
 * ClassName: Customer
 * Package: com.atguigu08.constructor.exer3
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/1/25 17:13
 * @Version 1.0
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f, String l){
        firstName = f;
        lastName = l;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setAccount(Account a){
        account = a;
    }
    public Account getAccount(){
        return account;
    }
}
