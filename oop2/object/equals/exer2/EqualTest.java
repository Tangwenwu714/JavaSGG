package com.atguigu07.object.equals.exer2;

/**
 * ClassName: EqualTest
 * Package: com.atguigu07.object.equals.exer2
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/18 21:03
 * @Version 1.0
 */
public class EqualTest {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(14, 3, 1976);
        MyDate m2 = new MyDate(14, 3, 1976);
        if (m1 == m2) {
            System.out.println("m1==m2");
        } else {
            System.out.println("m1!=m2"); // m1 != m2
        }

        if (m1.equals(m2)) {
            System.out.println("m1 is equal to m2");// m1 is equal to m2
        } else {
            System.out.println("m1 is not equal to m2");
        }
    }
}
