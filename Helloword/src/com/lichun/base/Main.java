package com.lichun.base;

import com.lichun.base.obj.*;

public class Main {

    public static void main(String[] args) {

        // 类和对象
        Dog dog = new Dog("花花");
        System.out.println(Dog.title);
        System.out.println(dog.id);
        System.out.println(dog.name);
        System.out.println(dog.hobby);
        dog.array();
        dog.dateTime();
        dog.regex();

        Person p = new Person();
        p.name = "人";
        p.say();
        Teacher t = new Teacher();
        t.name = "老师";
        t.say();
        t.say("真的不想说");
        t.sayHi();

        new Student(t);
        new Parents(t);
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
