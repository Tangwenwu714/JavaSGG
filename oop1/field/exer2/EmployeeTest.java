package com.atguigu03.field_method.field.exer2;

/**
 * ClassName: EmployeeTest
 * Package: com.atguigu03.field_method.field.exer2
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2023/12/18 14:21
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();

        emp1.id = 1001;
        emp1.name = "Jack"; // emp1.name = new String("Jack");
        emp1.age = 14;
        emp1.salary = 8900;

        emp1.birthday = new MyDate();
        emp1.birthday.year = 1998;
        emp1.birthday.month = 2;
        emp1.birthday.day = 27;
        /*
        另一种写法 (不建议)
        MyDate  mydate1 = new MyDate();
        emp1.birthday = mydate1;
         */

        //打印员工信息
        System.out.println("id = " + emp1.id + ",name = " + emp1.name
        + ", age = " + emp1.age + ",salary" + emp1.salary
        + ", birthday + [" + emp1.birthday.year + emp1.birthday.month + emp1.birthday.day +"]");

    }
}
