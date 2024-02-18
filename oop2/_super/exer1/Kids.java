package com.atguigu05._super.exer1;

/**
 * ClassName: Kids
 * Package: com.atguigu03._extends.exer1
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/17 17:35
 * @Version 1.0
 */
public class Kids extends ManKind {
    private int yearsOld;
    public Kids(){

    }
    public Kids(int yearsOld){
        this.yearsOld = yearsOld;
    }
    public Kids(int sex,int salary,int yearsOld){
        this.yearsOld = yearsOld;
        setSex(sex);
        setSalary(salary);
    }
    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
    public void printAge(){
        System.out.println("I am" + yearsOld);
    }
    public void employeed(){
        super.employeed();
        System.out.println("Kids should study and no job");
    }

}
