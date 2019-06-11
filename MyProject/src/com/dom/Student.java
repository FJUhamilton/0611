package com.dom;

public class Student {
	int score;
    public void print(){
        System.out.print(score);
    }

    public static void main(String[] args) {
        Student tom = new Student();
        tom.print();
    }
}
