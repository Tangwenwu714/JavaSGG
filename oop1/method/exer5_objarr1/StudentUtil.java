package com.atguigu04.example.exer5_objarr1;

/**
 * ClassName: StudentUtil
 * Package: com.atguigu04.example.exer5_objarr1
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2023/12/22 23:13
 * @Version 1.0
 */
public class StudentUtil {
    /*
     *打印出指定年纪的学生信息
     **/
    public void  printStudentsWithIndex(Student[] students,int state){
        for (int i = 0; i < students.length; i++) {
            if (state == students[i].state){
                Student stu = students[i];
                System.out.println(stu.show());
            }
        }
    }
    public void printStudents(Student[] students){
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].show());
        }
    }

    /**
     * 针对学生数组冒泡排序
     * @param students
     */
    public void sortStudents(Student[] students){
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length-1-i; j++) {
                if (students[j].score > students[j+1].score){
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
    }
}

