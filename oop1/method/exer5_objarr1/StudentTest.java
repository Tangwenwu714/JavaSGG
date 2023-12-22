package com.atguigu04.example.exer5_objarr1;

/**
 * ClassName: StudentTest
 * Package: com.atguigu04.example.exer5_objarr
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2023/12/22 21:44
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        // 创建Student[]
        Student[] students = new Student[20];
        // 使用循环，给数组元素赋值
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].number = i + 1;
            // 给每一个学生对象的number,state,score赋值
            students[i].state = (int)(Math.random() * 6 + 1);
            students[i].score = (int)(Math.random() * 101);
        }
        // 打印3年纪的学生信息
        StudentUtil util = new StudentUtil();
        util.printStudentsWithIndex(students,3);

        System.out.println("-------");
        // 按成绩冒泡排序后，遍历所有学生信息
        util.sortStudents(students);

        util.printStudents(students);
    }
}
