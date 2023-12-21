package com.atguigu03.field_method.method.exer;

/**
 * ClassName: EmployeeTest
 * Package: com.atguigu03.field_method.field.exer1
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2023/12/18 13:59
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        // 创建类的实例化
        Employee emp1 = new Employee();

        emp1.id = 1001;
        emp1.name = "Tom";
        emp1.age = 23;
        emp1.salary = 7800;

        emp1.show();
        System.out.println(emp1.show1());

        // 创建Employee的第二个对象
        Employee emp2 = new Employee();

        emp2.id = 1002;
        emp2.name = "Jerry";
        emp2.age = 18;
        emp2.salary = 6500;

        emp2.show();

    }
}
