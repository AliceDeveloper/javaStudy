package com.lichun.base;

import com.lichun.base.obj.*;

public class Main {

    public static void main(String[] args) {

        Person p = new Person();
        System.out.println(p.id);
        p.name = "人";
        p.say();
        p.regex();

        Teacher t = new Teacher();
        t.name = "老师";
        t.say();
        t.say("真的不想说");
        t.new InnerClass("内部类来了");
        new Teacher.StaticInnerClass("静态内部类来了");

        new Student(t);
        t.setHomework("我是语文作业");
        t.setHomework("我是数学作业");

        CallbackInstance cb = new CallbackInstance(new Callback() {
            @Override
            public void callback(String string) {
                System.out.println(string);
            }
        });
        cb.setCbString("作业来了！");
    }
}
