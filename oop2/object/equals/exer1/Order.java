package com.atguigu07.object.equals.exer1;

/**
 * ClassName: Order
 * Package: com.atguigu07.object.equals.exer1
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/18 20:52
 * @Version 1.0
 */
public class Order {
    private int orderID;
    private String orderName;

    public Order() {
    }

    public Order(int orderID, String orderName) {
        this.orderID = orderID;
        this.orderName = orderName;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (obj instanceof Order){
            Order order = (Order) obj;
            return this.orderID==order.orderID && this.orderName.equals(order.orderName);
        }

        return false;
    }
}
