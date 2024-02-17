package com.atguigu03._extends.exer1;

/**
 * ClassName: ManKind
 * Package: com.atguigu03._extends.exer1
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/17 17:05
 * @Version 1.0
 */
public class ManKind {
    private int sex;
    private int salary;
    public ManKind() {
    }

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }



    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWomen(){
        if (sex == 1){
            System.out.println("Man");
        } else if (sex == 0) {
            System.out.println("Woman");
        }
    }

    public void employeed(){
         if (salary == 0){
             System.out.println("no job");
         } else {
             System.out.println("job");
         }
    }

}
