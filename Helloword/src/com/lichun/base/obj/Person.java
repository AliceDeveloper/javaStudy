package com.lichun.base.obj;

public class Person {

    // static：修饰静态类、静态方法、静态属性，生命周期为整个程序的生命周期
    // final：修饰类的时候不能被继承，修饰方法的时候不能被重写，修饰属性的时候为常量(直接赋值和构造方式赋值)
    public final String id = "写代码的狗子";
    public String name;

    public void say() {
        System.out.println("我是：" + name);
    }
}
