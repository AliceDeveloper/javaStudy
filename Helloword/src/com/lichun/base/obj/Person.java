package com.lichun.base.obj;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {

    // 代码块在构造方法之前运行，静态代码块在代码块之前运行

    // 读取控制台输入
    // Scanner in = new Scanner(System.in);
    // String str = in.next();

    // 属性通常是私有的，使用set/get方法存取值
    // static：修饰静态类、静态方法、静态属性，生命周期为整个程序的生命周期
    // final：修饰类的时候不能被继承，修饰方法的时候不能被重写，修饰属性的时候为常量(直接赋值和构造方式赋值)
    public final String id = "写代码的狗子";
    public String name;

    public void say() {
        System.out.println(name);
    }

    public void regex() {
        Matcher m = Pattern.compile("\\bcat\\b").matcher("cat cat cat catch cat");
        while (m.find()) {
            System.out.println("start(): " + m.start());
            System.out.println("end(): " + m.end());
        }
        // matches 和 lookingAt 方法都用来尝试匹配一个输入序列模式。matcher 要求整个序列都匹配，lookingAt 不要求。
        m = Pattern.compile("foo").matcher("foo foo");
        System.out.println(m.matches());
        System.out.println(m.lookingAt());
    }
}
