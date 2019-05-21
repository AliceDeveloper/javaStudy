package com.lichun.base.obj;

// 使用关键字extends，子类可以继承父类的除private属性外所有的属性。
// 继承基本类和抽象类用extends关键字，实现接口类的继承用implements关键字。
public class Teacher extends Person implements Hi {

    // 重写是子类对父类的允许访问的方法的实现过程进行重新编写，返回值和形参都不能改变
    // 异常可以减少或删除，一定不能抛出新的或者更广的异常
    // 访问一定不能做更严格的限制（可以降低限制）
    public void say() {
        super.say();
        System.out.println("我是老师，我啥也不想说");
    }
    // 重载是在一个类里面，方法名字相同，而参数不同，返回类型可以相同也可以不同
    public void say(String var) {
        System.out.println("我是老师，" + var);
    }

    // 多态：类似于OC的多态

    // 抽象类：public abstract class Hi {}
    // 抽象方法：public abstract void function();
    // 注意：
    // 如果一个类包含抽象方法，那么该类必须是抽象类
    // 任何子类必须重写父类的抽象方法，或者声明自身为抽象类

    // 接口：interface Hi {}
    // 接口是隐式抽象的，接口中每一个方法也是隐式抽象的；
    // 在Java中，类的多重继承是不合法，但接口允许多重继承
    // 接口不能包含成员变量，除了static和final变量
    // 接口不能有构造器
    // 接口中的方法都是公有的
    @Override
    public void sayHi() {
        System.out.println("sayHi");
    }

    // Java使用包package这种机制是为了防止命名冲突，访问控制，提供搜索和定位类、接口、枚举和注释等
}
