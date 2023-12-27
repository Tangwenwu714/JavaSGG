package com.atguigu05.method_more._02args.exer;

/**
 * ClassName: StringCOnCatTest
 * Package: com.atguigu05.method_more._02args.exer
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2023/12/27 14:59
 * @Version 1.0
 */
public class StringConCatTest {
    public static void main(String[] args) {
        StringConCatTest test = new StringConCatTest();
        String info = test.concat("-","hello","world");
        System.out.println(info); //hello-world
    }
    public String concat(String operator, String ... strs){
        String result = "";

        for (int i = 0; i < strs.length; i++) {
            if(i == 0){
                result += strs[i];
            }else {
                result += (operator + strs[i]);
            }
        }

        return result;
    }
}
