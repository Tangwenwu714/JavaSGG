package com.atguigu07.encapsulation.exer3;

/**
 * ClassName: Employee
 * Package: com.atguigu07.encapsulation.exer3
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/1/15 23:31
 * @Version 1.0
 */
public class Employee {
    private String name;
    private char gender;
    private int age;
    private String phoneNumber;

    public void setName(String n){
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setGender(char g) {
        gender = g;
    }
    public char getGender(){
        return gender;
    }
    public void setAge(int a) {
        age = a;
    }
    public int getAge(){
        return age;
    }
    public void setPhoneNumber(String pn) {
        phoneNumber = pn;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getInfo(){
        return name + "\t" + gender + "\t" + age + "\t" + phoneNumber;
    }
}
