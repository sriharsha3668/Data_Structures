package com.company;

import java.util.ArrayList;

class Container<T extends Number>
{
    T value;
    public void show()
    {
        System.out.println(value.getClass().getName());
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    public void demo(ArrayList<? super T>obj)
    {
        System.out.println("Demo is Executed");

    }
}
public class Main {

    public static void main(String[] args) {

        int value = 5;
        Container<Number> obj = new Container<>();
        obj.value = 9.8;
        obj.show();
        obj.demo(new ArrayList<Number>());

    }
}
