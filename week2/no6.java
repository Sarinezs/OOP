
class Date{
    private int d,m,y;
    Date(){}
    Date(int d, int m, int y){
        this.d = d;
        this.m = m;
        this.y = y;
    }

    @Override
    public String toString(){
        return d+"/"+m+"/"+y;
    }
}

class Account{
    private int id;
    private double balance;
    private double annualinterestRate;
    private Date dateCreated;

    Account(){}
    Account(int id, double bal){
        this.id = id;
        this.balance =bal;
    }

    public void setid(int id){
        this.id = id;
    }
    public int getid(){
        return this.id;
    }
    public void setbal(int bal){
        this.balance = bal;
    }
    public double getbal(){
        return this.balance;
    }
    public void setannual(double annual){
        this.annualinterestRate = annual;
    }
    public double getannual(){
        return this.annualinterestRate;
    }
    public void setdate(Date datecreated){
        this.dateCreated = datecreated;
    }

    public double getMonthlyinterestRate(){
        return this.annualinterestRate / 12;
    }
    public double getMonthlyinterest(){
        return (balance*annualinterestRate/100)/12;
    }
    public void withdraw(double amt){
        this.balance -= amt;
    }
    public void deposit(double amt){
        this.balance += amt;
    }

    @Override
    public String toString(){
        return "Account_ID : "+id+"\nbalance : "+balance+"\nDate Created : "
                +dateCreated+"\nMonthly interest : "+getMonthlyinterest();  
    }
}


public class no6 {
    public static void main(String[] args){
        Date armdate = new Date(9, 9, 2023);
        Account armAccount = new Account(1122, 20000);
        armAccount.setdate(armdate);
        armAccount.setannual(4.5);
        armAccount.withdraw(2500);
        armAccount.deposit(3000);
        System.out.println(armAccount);
    }
}
