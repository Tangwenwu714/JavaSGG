package com.atguigu05.exer.exer3;

/**
 * ClassName: NoLifeValueException
 * Package: com.atguigu05.exer.exer3
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/4/29 23:44
 * @Version 1.0
 */
public class NoLifeValueException extends RuntimeException{
    static final long serialVersionUID = -5461541615641L;
    public NoLifeValueException(){
    }

    public NoLifeValueException(String message){
        super(message);
    }
}
