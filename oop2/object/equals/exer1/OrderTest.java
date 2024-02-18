package com.atguigu07.object.equals.exer1;

/**
 * ClassName: OrderTest
 * Package: com.atguigu07.object.equals.exer1
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/18 20:56
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order(1001,"orderAA");
        Order order2 = new Order(1001,"orderAA");
        System.out.println(order1.equals(order2)); // true

        Order order3 = new Order(1002,new String("orderBB"));
        Order order4 = new Order(1003,new String("orderBB"));
        System.out.println(order3.equals(order4)); //false

    }
}
