package com.lichun.senior.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {

    public List courseToSelect;

    public ListTest() {
        this.courseToSelect = new ArrayList();
    }

    public void testAdd() {
        Course cr1 = new Course("1","数据结构");
        courseToSelect.add(cr1);

        Course cr2 = new Course("2", "C语言");
        courseToSelect.add(cr2);

        Course[] course = {new Course("3", "离散数学"), new Course("4", "汇编语言")};
        courseToSelect.addAll(0, Arrays.asList(course));

        for (int i = 0; i <courseToSelect.size() ; i++) {
            System.out.println(courseToSelect.get(i).toString());
        }
    }
}
