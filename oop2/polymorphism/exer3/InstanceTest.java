package com.atguigu06.polymorphism.exer3;

/**
 * ClassName: InstanceTest
 * Package: com.atguigu06.polymorphism.exer3
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/18 16:53
 * @Version 1.0
 */
public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();

        test.method(new Student());
    }
    public void method(Person e){
        System.out.println(e.getInfo());


        // 方式1：
//        if (e instanceof  Graduate){
//            System.out.println("a graduated student");
//            System.out.println("a student");
//            System.out.println("a person");
//        } else if (e instanceof Student) {
//            System.out.println("a student");
//            System.out.println("a person");
//        }else {
//            System.out.println("a person");
//        }
        // 方式2
        if (e instanceof Graduate){
            System.out.println("a graduated student");
        }

        if(e instanceof Student){
            System.out.println(" a student");
        }

        if (e instanceof Person){
            System.out.println("a person");
        }
    }
}
class Person {
    protected String name="person";
    protected int age=50;
    public String getInfo() {
        return "Name: "+ name + "\n" +"age: "+ age;
    }
}
class Student extends Person {
    protected String school="pku";
    public String getInfo() {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school;
    }
}
class Graduate extends Student{
    public String major="IT";
    public String getInfo()
    {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school+"\nmajor:"+major;
    }
}