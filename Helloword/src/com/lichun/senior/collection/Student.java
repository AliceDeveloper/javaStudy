package com.lichun.senior.collection;

import java.util.HashSet;
import java.util.Set;

public class Student {

    String id;
    String name;
    Set course;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.course = new HashSet();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
