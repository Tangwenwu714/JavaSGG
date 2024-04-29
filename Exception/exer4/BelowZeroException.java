package com.atguigu05.exer.exer4;

/**
 * ClassName: BelowZeroException
 * Package: com.atguigu05.exer.exer4
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/4/29 23:59
 * @Version 1.0
 */
public class BelowZeroException extends Exception{
    static final long serialVersionUID = -338751699229948L;

    public BelowZeroException() {
    }

    public BelowZeroException(String message) {
        super(message);
    }
}
