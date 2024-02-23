package com.atguigu08._interface.exer1;

/**
 * ClassName: EatableTest
 * Package: com.atguigu08._interface.exer1
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/23 21:32
 * @Version 1.0
 */
public class EatableTest {
    public static void main(String[] args) {
        Eateable[] eatables = new Eateable[3];

        eatables[0] = new Chinese();
        eatables[1] = new American();
        eatables[2] = new Indian();

        for (int i = 0; i < eatables.length; i++) {
            eatables[i].eat();
        }
    }
}
