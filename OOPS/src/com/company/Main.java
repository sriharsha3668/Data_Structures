package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student harsha = new Student();
        System.out.println(harsha.name);
        Student srikar = harsha;
//        System.out.println(srikar.name);
        harsha.greeting();
        Integer num = new Integer(45);
        Student A;
        for(int i = 0; i < 10000000; i++){
            A = new Student("Random Object");
        }
    }
}

class Student{
    int rollNo;
    String name;
    float marks;

    Student(){
        this(13,"SriHarsha Kanduri",95.16f);
    }
    Student(int rollNo,String name,float marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    Student(String name){
        this.name = name;
    }

    void greeting(){
        System.out.println("Hello, My name is " + this.name);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }


}