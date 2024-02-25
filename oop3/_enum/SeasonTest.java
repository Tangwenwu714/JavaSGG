package com.atguigu10._enum;

/**
 * ClassName: SeasonTest
 * Package: com.atguigu10._enum
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/25 15:29
 * @Version 1.0
 */
public class SeasonTest {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
    }
}
// Before Jdk5.0
class Season{
    // 2. 声明当前类的对象的实例变量
    private final String seasonName;
    private final String seasonDesc;

    // 1. 私有化构造器
    private Season(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    // 3. 提供实例变量的get 方法

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    // 4. 创建当前类的实例, 需要public static final 修饰
    public static final Season SPRING = new Season("Spring", "Fruitful");
    public static final Season SUMMER = new Season("Summer", "Hot");
    public static final Season AUTUMN = new Season("Autumn", "Cool");
    public static final Season WINTER = new Season("Winter", "Cold");

    @Override
    public String toString() {
        return seasonName + seasonDesc;
    }
}