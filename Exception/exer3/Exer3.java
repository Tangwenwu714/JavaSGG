package com.atguigu05.exer.exer3;

/**
 * ClassName: Exer3
 * Package: com.atguigu05.exer.exer3
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/4/29 23:50
 * @Version 1.0
 */
public class Exer3 {
    public static void main(String[] args) {
        //1. 使用有参构造器
        try{
            Person p1 = new Person("Tom",-10);
            System.out.println(p1);
        }catch (NoLifeValueException e){
            System.out.println(e.getMessage());
        }

        //2. 使用空参构造器
        Person p2 = new Person();
        p2.setName("Jerry");
        p2.setLifeValue(-10);

    }
}
