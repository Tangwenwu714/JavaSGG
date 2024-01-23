package com.atguigu07.encapsulation.exer3;

import java.util.Scanner;

/**
 * ClassName: EmployeeTest
 * Package: com.atguigu07.encapsulation.exer3
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/1/23 9:58
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //创建Employee
        Employee[] emps = new Employee[2];

        for (int i = 0; i < emps.length; i++) {
            emps[i] = new Employee();

            System.out.println("添加第"+ (i+1) + "个员工");
            System.out.println("姓名:");
            String name = scan.next();
            System.out.println("性别:");
            char gender = scan.next().charAt(0);
            System.out.println("年龄:");
            int age = scan.nextInt();
            System.out.println("电话:");
            String phoneNumber = scan.next();

            //各属性赋值
            emps[i].setName(name);
            emps[i].setGender(gender);
            emps[i].setAge(age);
            emps[i].setPhoneNumber(phoneNumber);
        }

        System.out.println("-------员工列表-------");
        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i].getInfo());
        }
    }
}
