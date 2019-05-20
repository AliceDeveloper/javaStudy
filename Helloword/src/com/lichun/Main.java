package com.lichun;

public class Main {

    public static void main(String[] args) {

        // 类和对象
        Dog dog = new Dog("花花");
        System.out.println(Dog.title);
        System.out.println(dog.id);
        System.out.println(dog.name);
        System.out.println(dog.hobby);
        dog.array();
        dog.dateTime();
    }
}
