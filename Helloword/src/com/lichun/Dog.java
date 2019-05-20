package com.lichun;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;

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
    public Dog(String var) {
        name = "狗子的名字：" + var;
    }

    public void array() {
        // 数组
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
    public void dateTime() {
        Date dateNow = new Date();
        System.out.println(dateNow);
        System.out.println(dateNow.toString());
        System.out.println(dateNow.getTime());
        System.out.println(dateNow.before(dateNow));
        System.out.println(dateNow.after(dateNow));
        System.out.println(dateNow.equals(dateNow));
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(ft.format(dateNow));
        // 睡眠 3s
        //Thread.sleep(3000);
        System.out.println(System.currentTimeMillis());
    }
}
