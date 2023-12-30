package com.atguigu05.method_more._03valuetransfer.exer2;

/**
 * ClassName: MyArrays
 * Package: com.atguigu04.example.exer4
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2023/12/22 12:09
 * @Version 1.0
 */
public class MyArrays {

    /**
     * 获取int[] 数组的最大值
     *
     * @param arr 要获取最大值的数组
     * @return 数组的最大值
     */
    public int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 获取int[] 数组的最小值
     *
     * @param arr 要获取最小值的数组
     * @return 数组的最小值
     */
    public int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int getAvg(int[] arr) {

        return getSum(arr) / arr.length;
    }

    public void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print("," + arr[i]);
            }
        }

        System.out.println("]");
    }

    public int[] copy(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public void reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }

    public void sort(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            boolean flag = true; // 假设数组是有序的
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    // 交换
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    flag = false; // 如果元素发生了变化，那么说明数组还没排好序
                }
            }
            if (flag) {
                break;
            }
        }
    }

    /**
     * 针对数组进行排序操作
     * @param arr 待排序的数组
     * @param sortMethod asc: 升序 desc: 降序
     */
    public void sort(int[] arr,String sortMethod) {
        if("asc".equals(sortMethod)){ // 引用数据类型比较用euqals, 否则比较的是地址值
            for (int j = 0; j < arr.length - 1; j++) {
                for (int i = 0; i < arr.length - 1 - j; i++) {
                    if (arr[i] > arr[i + 1]) {
                        // 交换
                        swap(arr,i,i+1);
                    }
                }
            }

        } else if ("desc".equals(sortMethod)) {
            for (int j = 0; j < arr.length - 1; j++) {
                for (int i = 0; i < arr.length - 1 - j; i++) {
                    if (arr[i] < arr[i + 1]) {
                        // 交换
                        swap(arr,i,i+1);
                    }
                }
            }
        } else {
            System.out.println("你写的操作有误");
        }

    }

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int linearSearch(int[] arr, int target) {
        boolean isFlag = true;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}