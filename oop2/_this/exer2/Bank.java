package com.atguigu01._this.exer2;

/**
 * ClassName: Bank
 * Package: com.atguigu01._this.exer2
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/4 23:04
 * @Version 1.0
 */
public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;
    public Bank(){
        customers = new Customer[10];
    }

    /**
     * 将指定姓名的客户保存在银行的客户列表中
     * @param f
     * @param l
     */
    public void addCustomer(String f,String l){
        Customer cust = new Customer(f,l);
        customers[numberOfCustomer] = cust;
        numberOfCustomer ++;
    }

    /**
     * 获取客户列表中存储的客户个数
     * @return
     */
    public int getNumberOfCustomer(){
       return numberOfCustomer;
    }
    public Customer getCustomer(int index){
        if(index < 0 || index >= numberOfCustomer){
            return null;
        }
        return customers[index];
    }
}
