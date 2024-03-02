package com.atguigu12.wrapper.exer1;

import java.util.Scanner;
import java.util.Vector;

/**
 * ClassName: ScoreTest
 * Package: com.atguigu12.wrapper.exer1
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/29 16:32
 * @Version 1.0
 */
public class ScoreTest {
    public static void main(String[] args) {
        // 1.创建Vector 对象: Vector v = new Vector()
        Vector v = new Vector();

        Scanner scanner = new Scanner(System.in);

        int maxScore = 0; //记录最高分

        // 2. 从键盘获取多个学生成绩，放到v中
        while(true){

            System.out.println("请输入学生成绩：");
            int intScore = scanner.nextInt();

            if (intScore < 0){
                break;
            }

            v.addElement(intScore); // 自动装箱
            // 3. 获取学生成绩的最大值
            if (maxScore < intScore){
                maxScore = intScore;
            }


        }
        // 4. 依次获取v中的每个学生成绩，与最高分进行比较，获取学生等级
        for (int i = 0; i < v.size(); i++) {
            Object objScore = v.elementAt(i);
            // 转型并拆箱
            int score= (Integer) objScore;
            char grade = ' ';
            if (maxScore - score <= 10){
                grade = 'A';
            }else if (maxScore - score <= 20){
                grade = 'B';
            }else {
                grade = 'c';
            }


        }
    }
}
