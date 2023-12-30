package com.atguigu05.method_more._03valuetransfer.exer2;

/**
 * ClassName: MyArraysTest
 * Package: com.atguigu04.example.exer4
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2023/12/22 12:12
 * @Version 1.0
 */
public class MyArraysTest {
    public static void main(String[] args) {
        MyArrays arrs = new MyArrays();
        int[] arr = new int[]{34,56,223,2,56,24};
        System.out.println(arrs.getMax(arr));
        System.out.println(arrs.getAvg(arr));
        arrs.print(arr);

        // 查找
        int index = arrs.linearSearch(arr,24);
        System.out.println(index);

        System.out.println("Sort");
        // 排序
        arrs.sort(arr,"asc");
        arrs.print(arr);
    }
}
