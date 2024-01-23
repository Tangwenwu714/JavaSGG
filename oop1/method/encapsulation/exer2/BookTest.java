package com.atguigu07.encapsulation.exer2;

/**
 * ClassName: BookTest
 * Package: com.atguigu07.encapsulation.exer2
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/1/15 23:27
 * @Version 1.0
 */
public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();

        book1.setBookName("见Java");
        book1.setAuthor("尚硅谷教育");
        book1.setPrice(180.0);

        System.out.println(book1.showInfo());
    }
}
