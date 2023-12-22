package com.atguigu04.example.exer5_objarr1;

/**
 * ClassName: Student
 * Package: com.atguigu04.example.exer5_objarr
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2023/12/22 21:43
 * @Version 1.0
 */
public class Student {

    //属性
    int number;
    int state;
    int score;

    // 声明方法显示学生信息
    public String show(){
        return "number :" + number + "state :"
                + state + "score " + score;
    }
}
