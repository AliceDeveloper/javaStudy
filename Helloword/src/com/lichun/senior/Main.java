package com.lichun.senior;

import com.lichun.senior.file.FileClass;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // 国际化 Locale
        // 获取资源文件 ResourceBundle rb = ResourceBundle.getBundle("filePath", locale);
        // 数学函数 Math：Math.PI、Math.random()
        // 数组 Arrays
        int[] nums = {1, 3, 2, 5, 6};
        Arrays.sort(nums);
        // 二分查找法，查找速度快，要求数组是有序的
        System.out.println(Arrays.binarySearch(nums, 3));
        // 日期时间 Date
        Date now = new Date();
        System.out.println(now.getTime());
        System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(now));
        System.out.println(String.format("%tc", now));
        System.out.println(Calendar.getInstance());
        try {
            // 睡眠 1s
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
        // 对象比较器 Comparable接口，在类中实现 Comparable 的 compareTo() 方法
        // 对象克隆器 Cloneable接口，在类中重写 Cloneable 的 clone() 方法

        FileClass fileClass = new FileClass();
        // 注意：如果是文本类文件建议使用字符流，如果是非文本类文件建议使用字节流
        // 字节输出流：OutputStream 字节输入流：FileInputStream
        fileClass.write();
        fileClass.read();
        // 字符输出流：Writer 字符输入流：Reader
        fileClass.writer();
        fileClass.reader();
    }
}
