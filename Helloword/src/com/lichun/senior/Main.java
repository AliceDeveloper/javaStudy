package com.lichun.senior;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        final String path = "/Users/cdct/Desktop/javaStudy/Helloword/src/";

        StringBuffer sBuffer = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            sBuffer.append(i);
        }
        System.out.println(sBuffer);
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sBuilder.append(i);
        }
        System.out.println(sBuilder);

        // 国际化 Locale
        // 获取资源文件 ResourceBundle rb = ResourceBundle.getBundle("filePath", locale);
        // 数学函数 Math
        // 伪随机数 Random
        // 数组 Arrays
        int[] nums = {1, 3, 2, 5, 6};
        Arrays.sort(nums);
        // 二分查找法，查找速度快，要求数组是有序的
        System.out.println(Arrays.binarySearch(nums, 6));
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
        // 对象比较器 Comparable接口，Comparator接口
        // 在类中实现 Comparable 的 compareTo() 方法
        // 对象克隆器 Cloneable接口
        // 重写 Cloneable 的 clone() 方法

        // 文件 File
        File file = new File(path + "source/image.jpg");
        if (file.exists()) {
            System.out.println("文件大小：" + file.length());
            System.out.println("文件最后更新时间：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file.lastModified()));
            System.out.println("文件绝对路径：" + file.getAbsolutePath());
            System.out.println("文件是否是目录：" + file.isDirectory());
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        findFile(new File(path), ".java");
    }

    /**
     * 递归查找文件
     * @param target 文件
     * @param ext 后缀名
     */
    public static void findFile(File target, String ext) {
        if (target != null) {
            if (target.isDirectory()) {
                File[] files = target.listFiles();
                if (files != null) {
                    for (File file : files) {
                        findFile(file, ext);
                    }
                }
            } else {
                String path = target.getAbsolutePath();
                if (path.endsWith(ext)) {
                    System.out.println(path);
                }
            }
        }
    }
}
