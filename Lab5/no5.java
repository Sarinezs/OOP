// package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

class employee{
    private String firstname;
    private String lastname;
    private String id;
    private double sal;
    private int year;

    employee(){}

    public employee(String firstname, String lastname, String id, double sal){
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.sal = sal;
    }

    double earning(){
        double net_sal = sal * 0.95;
        return net_sal;
    }
    double bonus(int year){
        if(year > 5){
            return sal * 12;
        }
        else{
            return sal * 6;
        }
    }
    public String getfirstname(){
        return this.firstname;
    }
    public String getlastname(){
        return this.lastname;
    }

    public int getyear(){
        return this.year;
    }
    public void setyear(int year){
        this.year = year;
    }

    void printarraylist(ArrayList<employee> a){
        System.out.println("First name\t"+"Last name\t"+"Earning\t"+"\tBonus");
        for(int i = 0 ; i< a.size(); i++){
            employee emp = a.get(i);
            System.out.println(emp.getfirstname()+"\t\t"+emp.getlastname()+"\t\t"+emp.earning()+"\t\t"+emp.bonus(emp.getyear()));
        }   
    }
}

public class no5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList <employee> obj = new ArrayList<employee>(); 

        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            String firstname = sc.next();
            String lastname = sc.next();
            String id =  sc.next();
            double salary = sc.nextDouble();
            int year = sc.nextInt();
            employee e = new employee(firstname, lastname, id, salary);
            e.setyear(year);
            obj.add(e);
        }
        employee e = new employee();
        e.printarraylist(obj);
    }
}
