package com.lichun.base.obj;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

    /**
     * // 单例模式
     * private static Person instance = null;
     * <p>
     * // 构造方法私有化
     * private Person() {
     * }
     * <p>
     * public static Person shareInstance() {
     * if (instance == null) {
     * instance = new Person();
     * }
     * return instance;
     * }
     */
    // 继承使用关键字extends，构造方法不能被继承
    // 实现接口使用关键字implements

    // 重写是子类对父类的允许访问的方法的实现过程进行重新编写，返回值和形参都不能改变
    public void say() {
        super.say();
    }

    // 重载是在一个类里面，方法名字相同，而参数不同，返回类型可以相同也可以不同
    public void say(String var) {
        System.out.println(name + "：" + var);
    }

    // 抽象类和抽象方法修饰符：abstract
    // 注意：
    // 如果类包含抽象方法，那么该类必须是抽象类
    // 继承抽象类必须重写父类的抽象方法，或者声明自身为抽象类
    // 抽象类不能被实例化
    // 抽象类不能声明为final

    // 接口修饰符：interface
    // 接口是隐式抽象的，接口中每一个方法也是隐式抽象的；
    // 在Java中，类的多重继承是不合法，但接口允许多重继承
    // 接口不能包含成员变量，除了static和final变量
    // 接口不能有构造器
    // 接口中的方法都是公有的

    // 类中内部类
    public class InnerClass {
        public InnerClass(String string) {
            System.out.println("内部类：" + string);
        }
    }

    // 类中静态内部类，创建静态内部类对象不需要依赖外部类的对象
    public static class StaticInnerClass {
        public StaticInnerClass(String string) {
            System.out.println("静态内部类：" + string);
        }
    }
    // Teacher t = new Teacher();
    // t.new InnerClass("内部类来了");
    // new Teacher.StaticInnerClass("静态内部类来了");
    // 方法中内部类，不能使用非final修饰的变量

    // Java观察者模式
    private String homework;
    private List<HomeworkObserver> observers = new ArrayList<>();

    String getHomework() {
        return homework;
    }

    public void setHomework(String homework) {
        this.homework = homework;
        for (HomeworkObserver observer : observers) {
            observer.update();
        }
    }

    void attach(HomeworkObserver homeworkObserver) {
        observers.add(homeworkObserver);
    }
}

