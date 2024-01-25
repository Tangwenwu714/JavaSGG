package com.atguigu08.constructor.exer1;

/**
 * ClassName: StudentTest
 * Package: com.atguigu08.constructor.exer1
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/1/25 16:19
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("刘强东",48,"RUC","社会学");
        System.out.println(s1.getInfo());

    }
}
