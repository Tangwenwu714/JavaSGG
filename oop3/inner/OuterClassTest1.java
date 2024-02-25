package com.atguigu09.inner;

/**
 * ClassName: OuterClassTest1
 * Package: com.atguigu09.inner
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/25 13:29
 * @Version 1.0
 */
public class OuterClassTest1 {
    // 局部内部类的使用
    public void method1(){
        class A{
            // 可以声明属性，方法等

        }
    }

    // 开发中的场景
    public Comparable getInstance(){
        // 提供了实现了Comparable 接口的类
        // 方式1: 提供了接口的实现类的匿名对象
//        class MyComparable implements Comparable{
//
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//
//        return new MyComparable();

        // 方式2: 提供了接口的匿名实现类的匿名对象
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
