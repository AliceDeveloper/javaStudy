package com.lichun.base.obj;

public class Student extends HomeworkObserver {

    public Student(Teacher teacher) {
        this.teacher = teacher;
        this.teacher.attach(this);
    }

    @Override
    public void update() {
        System.out.println("我是学生：" + teacher.getHomework());
    }
}
