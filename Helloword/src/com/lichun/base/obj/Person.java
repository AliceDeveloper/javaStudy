package com.lichun.base.obj;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {

    /**
     * // 单例模式
     * private static Person instance = null;
     * // 构造方法私有化
     * private Person() {}
     * public static Person shareInstance() {
     * if (instance == null) {
     * instance = new Person();
     * }
     * return  instance;
     * }
     */
    // 静态代码块在代码块之前运行
    // 代码块在构造方法之前运行

    // 读取控制台输入
    // Scanner in = new Scanner(System.in);
    // String str = in.next();

    // 属性通常是私有的，使用set/get方法设值和取值
    // static 修饰静态属性、静态方法，生命周期为整个程序的生命周期
    // final：修饰类的时候不能被继承，修饰方法的时候不能被重写，修饰属性的时候为常量(直接赋值和构造方式赋值)
    public final String id = "写代码的狗子";
    public String name;

    public void say() {
        System.out.println(name);
    }

    public void regex() {
        // Pattern对象是一个正则表达式的编译表示
        // Matcher对象是对输入字符串进行解释和匹配操作的引擎
        // PatternSyntaxException是一个非强制异常类，它表示一个正则表达式模式中的语法错误。
        Pattern p = Pattern.compile("\\bcat\\b");
        Matcher m = p.matcher("cat cat cat catch cat");
        while (m.find()) {
            System.out.println("start(): " + m.start());
            System.out.println("end(): " + m.end());
        }
        // matches 和 lookingAt 方法都用来尝试匹配一个输入序列模式。matcher 要求整个序列都匹配，lookingAt 不要求。
        p = Pattern.compile("foo");
        m = p.matcher("foo foo");
        System.out.println(m.matches());
        System.out.println(m.lookingAt());
    }
}
