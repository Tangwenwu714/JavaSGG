package com.atguigu01._this;

/**
 * ClassName: PersonTest
 * Package: com.atguigu01._this
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/4 21:15
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(10);
        System.out.println(p1.age);

        Person p2 = new Person("tom","tom@126.com");
    }
}

class Person{
    String name;
    int age;
    String email;
    public Person(){}
    public Person(String name,String email){
        this.name = name;
        this.email = email;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}
