/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// package week4;


class Date {
    Date(){
    }
    private int d,m,y;
    public Date(int d,int m,int y)
    {
        this.d=d;
        this.m=m;
        this.y=y;
    }
    @Override
    public String toString(){
        return "Create Date's "+d+"/"+m+"/"+y ;
    }
}
public class Account {
    private int id;
    private double balance,annualInterestRate;
    private Date dateCreated;
    Account(){
    }
    public Account(int id,double balance){
        this.id=id;
        this.balance=balance;
        
    }
    public void setId(int id){
        this.id=id;
    } 
    public void setbal(int balance){
        this.balance=balance;
    }
     public void setannin(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;
    }
      public void setdate(Date datecreated){
          this.dateCreated=datecreated;
    }
      public int  getid(){
          return id;
      }
       public double  getbal(){
          return balance;
      }
        public double getannual(){
          return annualInterestRate;
      }
        public Date getdatecreate(){
            return dateCreated;
        }
        public void deposit(double amount){
            balance+=amount;
        }
         public void withdraw(double amount){
            balance-=amount;
        }
         public double getMonthlyInterestRate(){
            return annualInterestRate/12;
         }
         public double  getMonthlyInterest()
         {
             return ((balance*annualInterestRate/100)/12);
         }
         public void printbal()
         {
             System.out.println("Your balance's: "+balance);
         }
          @Override
        public String toString(){
        return "Account Id:"+id +"\nBalance : "+balance +"\nAnnualInterest : "+annualInterestRate +"\nDate Create"+dateCreated ;
    }
         
         public static void main(String args[])
         {
             Account b1acc=new Account(1122,20000);
             Date  b1date=new Date(27,7,2023);
             b1acc.setdate(b1date);
             
             b1acc.setannin(4.5);
             b1acc.withdraw(2500);
             b1acc.printbal();
             b1acc.deposit(3000);
             b1acc.printbal();
             System.out.println("Yours MonthlyInterest's :" +b1acc.getMonthlyInterest());
             System.out.println("Yours MonthlyInterestRate's :" +b1acc.getMonthlyInterestRate());
             
             System.out.println(b1acc.dateCreated);
             System.out.println(b1acc);
         
         
         }
}
