package com.atguigu04.example.exer3;

/**
 * ClassName: Circle
 * Package: com.atguigu04.example.exer3
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2023/12/22 12:01
 * @Version 1.0
 */
public class Circle {
    //属性
    double radius; // 半径
    //方法
    public void findArea(){
        System.out.println(3.14 * radius * radius);
    }
    // 错误方法！
    public void findArea1(double r){
        System.out.println(3.14 * r * r );
    }
}
