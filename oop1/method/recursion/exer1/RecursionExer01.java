package com.atguigu05.method_more._04recursion.exer1;

/**
 * ClassName: RecursionExer01
 * Package: com.atguigu05.method_more._04recursion.exer1
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2023/12/30 13:48
 * @Version 1.0
 */
public class RecursionExer01 {
    // 练习1
    public int f(int n){
        if(n == 20){
            return 1;
        } else if (n == 21) {
            return 4;
        }else{
            return f(n + 2) - 2*f(n + 1);
        }
    }

    // 练习2
    public int func(int n){
        if(n == 0){
            return 1;
        } else if (n == 1) {
            return 4;
        }else{
            return f(n - 2) - 2*f(n - 1);
        }
    }
}
