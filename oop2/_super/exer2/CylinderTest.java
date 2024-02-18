package com.atguigu05._super.exer2;

/**
 * ClassName: CylinderTest
 * Package: com.atguigu03._extends.exer2
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/17 19:54
 * @Version 1.0
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();

        cy.setRadius(2.3);
        cy.setLength(1.4);

        System.out.println(cy.findVolume());
    }
}
