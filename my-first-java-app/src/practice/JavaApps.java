package practice;


import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.Exchanger;

public class JavaApps
{
    public static void main( String[] args )
    {
        //JavaApps newJavaApps = new JavaApps();
        //System.out.println(newJavaApps.getClass().getName());
        Employee newEmp = (Employee) getEmployee();
        Class c = newEmp.getClass();
        System.out.println(c);
        System.out.println(c.getName());
        System.out.println(c.getSuperclass().getName());
        System.out.println(newEmp.getClass().getName());

        boolean flag = false;
        if ( newEmp.getClass().getName().equals("practice.HourlyEmployee") )
        {
            flag = true;
        }
        System.out.println(flag);

        String msg;
        if ( newEmp instanceof SalariedEmployee)
        {
            msg = " Employee salary is " +( (SalariedEmployee) newEmp ).getFormattedSalary();
        }
        else
        {
            msg = " Employee salary is " +( (HourlyEmployee) newEmp ).getFormattedRate();
        }
        System.out.println(msg);
        int x = NewInterface.x;
        System.out.println(x);



    }

    static public Object getEmployee()
    {
        Employee emp = new SalariedEmployee();
        return emp;
    }


}

class Employee
{
    private double salary;

    Employee()
    {
        this.salary = 4000;
    }

    Employee( int salary)
    {
        this.salary = salary;
    }

    public double getSalary()
    {
        return this.salary;
    }

    public void setSalary( double salary)
    {
        this.salary = salary;
    }

}

class SalariedEmployee extends Employee
{
    SalariedEmployee()
    {
        setSalary(1000.00);
    }
    /*
    SalariedEmployee()
    {
        super(300);
        setSalary(1000.00);
    }
    */

    public double getFormattedSalary()
    {
        return getSalary();
    }

}

class HourlyEmployee extends Employee
{

    HourlyEmployee()
    {
        super(400);
        setSalary(2000.00);
    }


    public double getFormattedRate()
    {
        return getSalary();
    }

}

interface NewInterface
{
    int x = 10;
    public int getVal();
}

class NewInterfaceImp implements NewInterface
{
    public int getVal( )
    {
        return 300;
    }
}

class Car
{
    public int x;
}