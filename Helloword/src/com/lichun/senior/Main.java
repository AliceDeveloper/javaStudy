package com.lichun.senior;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {

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

        // 文件 File
        String path = "/Users/lichun/javaStudy/Helloword/src/";
        File file = new File(path + "source/image.jpg");
        if (file.exists()) {
            System.out.println("文件大小：" + file.length());
            System.out.println("文件最后更新时间：" + file.lastModified());
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // 递归查找文件
        findFile(new File(path), ".java");

        // 注意：如果是文本类文件建议使用字符流，如果是非文本类文件建议使用字节流
        // 字节输出流：OutputStream 字节输入流：FileInputStream
        write();
        read();
        // 字符输出流：Writer 字符输入流：Reader
        writer();
        reader();
    }

    /**
     * 递归查找文件
     *
     * @param target 文件
     * @param ext    后缀名
     */
    private static void findFile(File target, String ext) {
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

    /**
     * 字节输出流
     */
    private static void write() {
        File file = new File("/Users/lichun/Desktop/OutputStream.txt");
        try {
            OutputStream out = new FileOutputStream(file);
            out.write("字节输出流".getBytes());
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 字节输入流
     */
    private static void read() {
        File file = new File("/Users/lichun/Desktop/OutputStream.txt");
        try {
            InputStream in = new FileInputStream(file);
            byte[] bytes = new byte[1024 * 1024];
            int len;
            StringBuilder sb = new StringBuilder();
            while ((len = in.read(bytes)) != -1) {
                sb.append(new String(bytes, 0, len));
            }
            in.close();
            System.out.println("字节输入流：" + sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 字符输出流
     */
    private static void writer() {
        File file = new File("/Users/lichun/Desktop/Writer.txt");
        try {
            Writer out = new FileWriter(file);
            out.write("字符输出流,字符输出流");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 字符输入流
     */
    private static void reader() {
        File file = new File("/Users/lichun/Desktop/Writer.txt");
        try {
            Reader in = new FileReader(file);
            char[] cs = new char[2];
            int len;
            StringBuilder sb = new StringBuilder();
            while ((len = in.read(cs)) != -1) {
                sb.append(new String(cs, 0, len));
            }
            in.close();
            System.out.println("字符输入流：" + sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
