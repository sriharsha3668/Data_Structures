package com.company;
import java.io.*;
class Train
{
    long train_num;
    String train_name;
    String Source;
    String Destination;
    int capacity;
    String Date;
    void initialize()
    {
        train_num = 2010110649;
        train_name = "Shatabdhi";
        Source = "Vizag";
        Destination = "Hyderabad";
        capacity = 2500;
        Date = "9/12/21";
    }
    void input() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the train name");
        train_name=br.readLine();
        System.out.println("Enter the Destination");
        Destination=br.readLine();
        System.out.println("Enter the source");
        Source=br.readLine();
        System.out.println("Enter the date");
        Date=br.readLine();
        System.out.println("Enter the capacity");
        capacity=Integer.parseInt(br.readLine());

    }
    void Display()
    {
        System.out.println ("Train name = "+train_name);
        System.out.println("Train number = "+train_num);
        System.out.println("Destination = "+Destination);
        System.out.println("Source = "+Source);
        System.out.println("Date = "+Date);
    }

}

public class Main {

    public static void main(String[] args) throws IOException {
        Train obj = new Train();
        obj.initialize();
        obj.input();
        obj.Display();

    }
}
