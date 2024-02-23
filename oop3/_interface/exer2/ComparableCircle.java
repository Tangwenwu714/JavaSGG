package com.atguigu08._interface.exer2;

/**
 * ClassName: ComparableCircle
 * Package: com.atguigu08._interface.exer2
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/23 21:41
 * @Version 1.0
 */
public class ComparableCircle extends Circle implements CompareObject{
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o){
            return 0;
        }

        if(o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle) o;
//            if (this.getRadius() > c.getRadius()){
//                return 1;
//            } else if (this.getRadius() < c.getRadius()) {
//                return  -1;
//            } else {
//                return 0;
//            }

            // 写法2
            return Double.compare(this.getRadius(),c.getRadius());
        }else {
//            return 2;
            throw new RuntimeException("输入的类型不匹配");
        }
    }
}
