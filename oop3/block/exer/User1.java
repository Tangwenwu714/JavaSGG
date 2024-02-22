package com.atguigu04.block.exer;

/**
 * ClassName: User1
 * Package: com.atguigu04.block.exer
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2024/2/22 20:25
 * @Version 1.0
 */
public class User1 {
    private String userName;
    private String password;
    private long registrationTime;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }
    {
        System.out.println("新用户注册");
        registrationTime = System.currentTimeMillis(); //获取系统当前时间 (距离1970-1-1 的毫秒数)
    }
    public User1(){

        userName = System.currentTimeMillis() + "";
        password = "123456";
    }
    public User1(String userName,String password){
        this.userName = userName;
        this.password = password;
    }
    public String getInfo(){
        return "用户名：" + userName + ", 密码："+ password + " 注册时间" + registrationTime;
    }
}
