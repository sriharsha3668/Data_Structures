package com.company;



 class Employee{
    private String EmpName;
    private long EmpID;

     public String getEmpName() {
         return EmpName;
     }

     public void setEmpName(String empName) {
         EmpName = empName;
     }

     public long getEmpID() {
         return EmpID;
     }

     public void setEmpID(long empID) {
         EmpID = empID;
     }

     Employee(String empName, long empID){
        this.EmpID = empID;
        this.EmpName = empName;
    }
    Employee(){
        EmpName = "Sri Harsha";
        EmpID = 2010110649;
    }





}

class Salary extends Employee{
    double basicPay,HRA,DA,CLA,GS,incometax;
    double netsalary;
    Salary(String empName,long empID,double bp){
        super(empName, empID);
        this.basicPay = bp;

    }

     void Calculate(){
        HRA=(10.0/100.0)*basicPay;
        DA=(73.0/100.0)*basicPay;
        GS=basicPay+DA+HRA;
        incometax=(30.0/100.0)*GS;
        netsalary=GS-incometax;
    }

    public double NetSalary(){
        return netsalary;
    }

    public void setData(){

    }


    public void putData(){
        System.out.println("Employeeid  :  "+getEmpID()+"\n"+"Employename  :  "+getEmpName()+"\n"
                +"Employee basic salary :  "+basicPay+"\n"+"HRA  :  "+HRA+"\n"+"DA  :  "+DA+"\n"+
                "GS  :  "+GS+"\n"+"Incometax  :  "+incometax+"\n"+"netsalary  :  "+netsalary);
    }
}
public class Main {

    public static void main(String[] args) {

        Salary e = new Salary("Siva Charan",2010110769,50000);
        e.Calculate();
        e.putData();
        System.out.println("Net Salary of Employee is : " + e.NetSalary());




    }
}
