class Date{
    private int d,y;
    private String m;
    Date(){
        
    }
    
    public Date(int d, String m, int y){
        this.d = d;
        this.m = m;
        this.y = y;
    }
    public void setyear(int year){
        this.y = year;
    }
    public int getyear(){
        return this.y;
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
    private Person objperson;
    
    Account(){
    }
    
    Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }
    public void setid(int id){
        this.id = id;
    }
    public int getid(){
        return this.id;
    }
    public void setbal(double balance){
        this.balance = balance;
    }
    public double getbal(){
        return this.balance;
    }
    public void setannual(double annualinterestRate){
        this.annualinterestRate = annualinterestRate;
    }
    public double getannaul(){
        return this.annualinterestRate;
    }
    public void setdate(Date datecreated){
        this.dateCreated = datecreated;
    }
    public Date getdate(){
        return this.dateCreated;
    }
    public double getMonthlyinterestRate(){
        return this.annualinterestRate / 12;
    }
    public double getMonthlyinterest(){
        return (balance*annualinterestRate/100)/12 ;
    }
    public void withdraw(double amt){
        this.balance = this.balance - amt;
    }
    public void deposit(double amt){
        this.balance = this.balance + amt;
    }
    protected void tranferMoney(Account acc, double amt){
        this.balance -= amt;
        acc.balance += amt;
    }
    protected void setperson(Person person){
        this.objperson = person;
    }
    
    @Override
    public String toString(){
        return "account_id = "+id+"\n balance = "+balance+"\n Date Created = "+dateCreated+"\n Monthly interest "+getMonthlyinterest();
    }
}

class SavingAccount extends Account{
    SavingAccount(){
        super();
    }
    SavingAccount(int id, double amt){
        super(id , amt);
    }
    @Override
    public void tranferMoney(Account acc, double amt){
        super.tranferMoney(acc, amt);
        this.setbal(this.getbal()-20);
    }
    
}

class FixAccount extends Account{
    FixAccount(){
        super();
    }
    FixAccount(int id, double amt){
        super(id, amt);
    }
    @Override
    public void tranferMoney(Account acc, double amt){
        System.out.println("Your Account is FixAccount Cannot transfer");
    }
    @Override
    public void withdraw(double amt){
        Date current = new Date(7,"sep",2023);
        int time = this.getdate().getyear();
    }
}

class Person{
    private String name;
    private String surname;
    private int age;
    private Date bdate;
    
    Person(){
        
    }
    Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    protected void setname(String name){
        this.name = name;
    }
    protected String getname(){
        return this.name;
    }
    protected void setsurname(String surname){
        this.surname = surname;
    }
    protected String getsurname(){
        return this.surname;
    }
    @Override
    public String toString(){
        return " "+name+" "+surname;
    }
}
public class no6 {
    public static void main(String[] args){
       Date armdate = new Date(10,8,2020);
       Date aondate = new Date(16, 5, 2016);
       SavingAccount armaccount = new SavingAccount(1123, 20000);
       armaccount.setannual(4.5);
       SavingAccount aonaccount = new SavingAccount(1100, 30000);
       aonaccount.setannual(4.5);
       Person arm = new Person("suriya", "meerua");
       Person aon = new Person("sirisak", "meerua");
       armaccount.setperson(arm);
       armaccount.setdate(armdate);
       aonaccount.setdate(aondate);
       aonaccount.setperson(aon);
       armaccount.withdraw(3000);
       aonaccount.tranferMoney(armaccount, 10000);
       System.out.println(" "+armaccount);
       System.out.println();
       System.out.println(" "+aonaccount);
       
       
    }
}
