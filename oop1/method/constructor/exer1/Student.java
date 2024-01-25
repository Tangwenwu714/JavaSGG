package com.atguigu08.constructor.exer1;

/**
 * ClassName: Student
 * Package: com.atguigu08.constructor.exer1
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/1/25 16:16
 * @Version 1.0
 */
public class Student {
    String name;
    int age;
    String school;
    String major;
    public Student(String n, int a){
        name = n;
        age = a;
    }
    public Student(String n, int a, String s){
        name = n;
        age = a;
        school = s;
    }

    public Student(String n, int a, String s,String m){
        name = n;
        age = a;
        school = s;
        major = m;
    }
    public String getInfo(){
        return "name =:" + name +"age =:" + age;
    }
}
