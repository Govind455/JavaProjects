/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Employee 
{
//    here kb is object of Scanner class create for geting input
    Scanner kb = new Scanner(System.in);
//    here these are class variable for storing info about a employee
    private int Empage;
    private String name;
    private String city_name;
    
    // these are get information from an employee through below functions
    public void setEmpAge(int age)
    {
        Empage = age;
    }
    public void setEmpName(String EmpNaam)
    {
        name = EmpNaam;
    }
    public void setEmpCityName(String city)
    {
        city_name = city;
    }
//    there method for using to print detail about an employee
    public void getEmpName(){
        System.out.println("The name is :"+name);
    }
    public void getEmpAge(){
        System.out.println("The Age is :"+Empage);
    }
    public void getEmpCityName(){
        System.out.println("The city is :"+city_name);
    }
    public static void main(String args[]) {
        Employee Emp1 = new Employee();
        //calling function for first employee assining values in data members
        Emp1.setEmpName("Saurabh");
        Emp1.setEmpAge(23);
        Emp1.setEmpCityName("Chennai");
        
//        display detail of fisrt employee
        Emp1.getEmpName();
        Emp1.getEmpAge();
        Emp1.getEmpCityName();
        
        Employee Emp2 = new Employee();
        //calling function for second employee assining values in data members
        Emp2.setEmpName("Gaurav");
        Emp2.setEmpAge(24);
        Emp2.setEmpCityName("Mumbai");
        
//        display detail of fisrt employee
        Emp2.getEmpName();
        Emp2.getEmpAge();
        Emp2.getEmpCityName();
    }
}
