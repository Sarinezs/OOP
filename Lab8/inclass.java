/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author student
 */
public class inclass {
    public static void main(String[] args){
        ArrayList<Employee> arr = new ArrayList<>();
        
        SalariedEmployee a = new SalariedEmployee("suriya", "meerua", "1", 20000);
        SalariedEmployee b = new SalariedEmployee("a", "b", "2", 30000);
        ComEmployee c = new ComEmployee("arm", "banana", "3", 30000,7);
        ComEmployee d = new ComEmployee("aon", "apple", "4", 25000,5);
        
        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.add(d);
        
        
        printEmp(arr);
    }
    
    public static void printEmp(ArrayList<Employee> e){
        double[] arrayEarn = new double [e.size()];
        double[] arrayBonus = new double [e.size()];
        for(int i = 0; i < e.size(); i++){
            Employee o = e.get(i);
            if(o instanceof SalariedEmployee){
                arrayEarn[i] = o.earning();
                arrayBonus[i] = o.bonus(7);
            }
            if(o instanceof ComEmployee){
                arrayEarn[i] = o.earning();
                arrayBonus[i] = o.bonus(5);
            }
        }
        
        System.out.println("Firstname\t"+"\tLastname\t"+"\tEarning\t"+"\tBonus");
        for(int i = 0; i<e.size(); i++){
            Employee o = e.get(i);
            System.out.println(o.getfirstname()+" "+o.getlastname()+" "+arrayEarn[i]+" "+arrayBonus[i]);
        }
    }
}

abstract class Employee{
    private String firstname;
    private String lastname;
    private String id;
    public Employee(String firstname, String lastname, String id){
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
    }
    
    String getfirstname(){
        return this.firstname;
    }
    
    String getlastname(){
        return this.lastname;
    }
    public abstract double earning();
    public abstract double bonus(int year);
}

class SalariedEmployee extends Employee{
    double salary;

    public SalariedEmployee(String firstname, String lastname, String id, double sal) {
        super(firstname, lastname, id);
        this.salary = sal;
    }
    
    @Override
    public double earning() {
        return salary * 0.95;
    }

    @Override
    public double bonus(int year) {
        if(year > 5){
            return 12*salary;
        }
        else{
            return 6*salary;
        }
    }
    
}

class ComEmployee extends Employee{
    double grosssale;
    double ComRate;
    
    ComEmployee(String firstname, String lastname, String id, double sale, double percent){
        super(firstname, lastname, id);
        this.grosssale = sale;
        this.ComRate = percent;
    }

    @Override
    public double earning() {
        return grosssale + (grosssale * ComRate);
    }

    @Override
    public double bonus(int year) {
        if(year > 5){
            return 6*grosssale;
        }
        else{
            return 3*grosssale;
        }
    }
    
}