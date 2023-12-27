package com.atguigu05.method_more._01overload;

/**
 * ClassName: OverloadExer
 * Package: com.atguigu05.method_more._01overload
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2023/12/25 10:26
 * @Version 1.0
 */
public class OverloadExer {
    // 练习2
    public void mOL(int num){
        System.out.println(num * num);
    }
    public void mOL(int num1,int num2){
        System.out.println(num1 * num2);
    }
    public void mOL(String message){
        System.out.println(message);
    }

    // 练习三
    public int max(int i,int j){
        return (i >= j)?i : j;
    }
    public double max(double d1,double d2){
        return (d1 >= d2)? d1:d2;
    }
    public double max(double d1,double d2,double d3){
        double tempMax = max(d1,d2);
        return max(d3,tempMax);
    }
}
