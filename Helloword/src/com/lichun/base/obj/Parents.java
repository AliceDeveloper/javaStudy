package com.lichun.base.obj;

public class Parents extends HomeworkObserver {

    public Parents(Teacher teacher) {
        this.teacher = teacher;
        this.teacher.attach(this);
    }

    @Override
    public void update() {
        System.out.println("我是家长：" + teacher.getHomework());
    }
}
