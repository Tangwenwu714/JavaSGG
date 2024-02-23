package com.atguigu08._interface.exer2;

/**
 * ClassName: InterfaceTest
 * Package: com.atguigu08._interface.exer2
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/23 23:58
 * @Version 1.0
 */
public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(2.3);
        ComparableCircle c2 = new ComparableCircle(4.2);

        int compareValue = c1.compareTo(c2);
        if (compareValue > 0){
            System.out.println("c1 is greater");
        } else if (compareValue < 0) {
            System.out.println("c2 is greater");
        }else {
            System.out.println("c1 equals c2");
        }
    }
}
