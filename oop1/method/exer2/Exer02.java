package com.atguigu04.example.exer2;

/**
 * ClassName: Exer02
 * Package: com.atguigu04.example.exer2
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2023/12/22 11:51
 * @Version 1.0
 */
public class Exer02 {
    public static void main(String[] args) {
        // 创建对象, 因为 static
        Exer02 exer = new Exer02();
        exer.method1();

        int area = exer.method2();
        System.out.println(area);

        int area1 = exer.method3(3,8);
        System.out.println(area1);
    }

    public void method1(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public int method2(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 10*8;
    }
    public int method3(int m, int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return m*n;
    }
}
