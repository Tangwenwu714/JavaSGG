package com.atguigu07._abstract.exer2;

import java.util.Scanner;

/**
 * ClassName: PayrollSystem
 * Package: com.atguigu07._abstract.exer2
 * Description:
 *利用循环结构遍历数组元素，输出各个对象的类型,name,number,birthday,以及该对象生日。
 * 当键盘输入本月月份值时，如果本月是某个Employee对象的生日，还要输出增加工资信息。
 * @Author Yubin-Liu
 * @Create 2024/2/23 15:37
 * @Version 1.0
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Employee[] emps = new Employee[2];

        emps[0] = new SalariedEmployee("Jack", 1001,
                new MyDate(1999,3,1),190999);
        emps[1] = new HourlyEmployee("Tom",1231,
                new MyDate(1993,12,4),13,4);

        System.out.println("请输入当前月份");
        int month = scan.nextInt();

        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i].toString());
            System.out.println("工资为" + emps[i].earnings());

            if (month == emps[i].getBirthday().getMonth()){
                System.out.println("生日快乐！加薪100");
            }
        }

        scan.close();
    }
}
