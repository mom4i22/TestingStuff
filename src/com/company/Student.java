package com.company;

public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int age) {
        this.age = age;
    }

    public Student() {
    }
}


