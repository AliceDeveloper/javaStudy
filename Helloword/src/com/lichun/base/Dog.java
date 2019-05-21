package com.lichun.base;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Dog {

    // Number：Byte、Short、Integer、Long、Float、Double
    // Character：
    // String：
    // 创建类方法和类变量
    static String title = "程序汪";
    // 常量
    final String id = "写代码的狗子";
    // 所有类可见
    public String name;
    // 该类和子类可见
    protected String hobby = "爱好：汪汪汪...";
    // 仅在该类可见
    private String log = "JAVA Demo";
    // instanceof 检查该对象是否是一个特定类型
    boolean ret = log instanceof String ? true : false;

    // 构造器
    Dog(String var) {
        name = "狗子的名字：" + var;
    }

    // 数组
    void array() {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + (j * i) + '\t');
            }
            System.out.println('\n');
        }
    }

    // 日期时间
    void dateTime() {
        Date dateNow = new Date();
        System.out.println(dateNow);
        System.out.println(dateNow.getTime());
        System.out.println(dateNow.before(dateNow));
        System.out.println(dateNow.after(dateNow));
        System.out.println(dateNow.equals(dateNow));
        // 格式化日期
        System.out.println(String.format("%tc", dateNow));
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(ft.format(dateNow));
        try {
            System.out.println(new Date());
            // 睡眠 1s
            Thread.sleep(1000);
            System.out.println(new Date());
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
    }

    void regex() {
        // Pattern对象是一个正则表达式的编译表示
        // Matcher对象是对输入字符串进行解释和匹配操作的引擎
        // PatternSyntaxException是一个非强制异常类，它表示一个正则表达式模式中的语法错误。
        Pattern p = Pattern.compile("\\bcat\\b");
        Matcher m = p.matcher("cat cat cat catch cat");
        while (m.find()) {
            System.out.println("start(): "+m.start());
            System.out.println("end(): "+m.end());
        }
        // matches 和 lookingAt 方法都用来尝试匹配一个输入序列模式。matcher 要求整个序列都匹配，lookingAt 不要求。
        p = Pattern.compile("foo");
        m = p.matcher("foo foo");
        System.out.println(m.matches());
        System.out.println(m.lookingAt());
    }

    // Stream File IO Scanner
}
