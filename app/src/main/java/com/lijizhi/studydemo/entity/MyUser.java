package com.lijizhi.studydemo.entity;

import cn.bmob.v3.BmobUser;

/*  项目名 StudyDemo
  *  包名  com.lijizhi.studydemo.entity
  *  文件名: MyUser
  *  创建者 : LJZ
  *  创建时间:2017/8/8 0008 下午 8:13
  *  描述    用户属性
*/
public class MyUser extends BmobUser{

    private int age;
    private boolean sex;
    private String desc;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }



}
