package com.atguigu05._super.exer1;

/**
 * ClassName: KidsTest
 * Package: com.atguigu03._extends.exer1
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/17 17:37
 * @Version 1.0
 */
public class KidsTest {
    public static void main(String[] args) {
        Kids kid = new Kids();

        kid.setSex(1);
        kid.setSalary(100);
        kid.setYearsOld(12);

        //来自于父类中声明的方法
        kid.employeed();
        kid.manOrWomen();

        // Kids类自己的声明
        kid.printAge();
        kid.employeed();
    }
}
