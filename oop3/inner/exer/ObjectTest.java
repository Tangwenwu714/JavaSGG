package com.atguigu09.inner.exer;

/**
 * ClassName: ObjectTest
 * Package: com.atguigu09.inner.exer
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/25 13:44
 * @Version 1.0
 */
public class ObjectTest {
    public static void main(String[] args) {
         new Object(){
            public void test(){
                System.out.println("尚硅谷");
            }
        }.test();
    }
}
