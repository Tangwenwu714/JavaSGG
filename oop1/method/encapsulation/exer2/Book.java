package com.atguigu07.encapsulation.exer2;

/**
 * ClassName: Book
 * Package: com.atguigu07.encapsulation.exer2
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/1/15 23:22
 * @Version 1.0
 */
public class Book {
    private String bookName;
    private String author;
    private double price;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bn) {
        bookName = bn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double p) {
        price = p;
    }

    // 获取图书信息
    public String showInfo(){
        return "bookName: " + bookName + ", author: " + author;
    }
}
