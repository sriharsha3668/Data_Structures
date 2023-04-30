package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(1,55));
        studs.add(new Student(2,95));
        studs.add(new Student(3,75));
        studs.add(new Student(4,65));
        studs.add(new Student(5,85));

        Collections.sort(studs,(s1, s2) -> {
            return (s1.marks>s2.marks) ? -1 : 1;
        });



        for(Student s : studs)
        {
            System.out.println(s);
        }

    }
}
class Student implements Comparable<Student>{
    int rollno;
    int marks;

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }

    public Student(int rollno, int marks)
    {
        this.rollno = rollno;
        this.marks = marks;

    }

    public int compareTo(Student s)
            // In case of Comparator Interface we use compare method -> 2 arguments
            // But in case of Comparable Interface, we use CompareTo method to compare 2 objects -> single argument
    {
        return (this.marks > s.marks) ? -1 : 1;
    }


}
