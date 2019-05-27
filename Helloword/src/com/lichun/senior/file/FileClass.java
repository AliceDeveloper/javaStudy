package com.lichun.senior.file;

import java.io.*;

public class FileClass {

    public FileClass() {

        File file = new File("/Users/lichun/javaStudy/Helloword/src/source/image.png");
        if (file.exists()) {
            System.out.println("文件大小：" + file.length());
            System.out.println("文件最后更新时间：" + file.lastModified());
        }
        // 递归查找文件
        findFile(new File("/Users/lichun/javaStudy/Helloword/src/"), ".java");
    }

    // 递归查找文件
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

    // 字节输出流
    public void write() {
        File file = new File("/Users/lichun/Desktop/OutputStream.txt");
        try {
            OutputStream out = new FileOutputStream(file);
            out.write("字节输出流".getBytes());
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 字节输入流
    public void read() {
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

    // 字符输出流
    public void writer() {
        File file = new File("/Users/lichun/Desktop/Writer.txt");
        try {
            Writer out = new FileWriter(file);
            out.write("字符输出流,字符输出流");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 字符输入流
    public void reader() {
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
