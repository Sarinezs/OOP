// package Lab7;

class Employee{
    protected int id;
    protected String name;
    protected double salary;
    protected Address address;

    Employee(int Id, String Name, double Salary, Address address_input){
        id = Id;
        name = Name;
        salary = Salary;
        address = address_input;
    }

    public String getDetails(){
        return "ID : "+getID()+"\nName : "+getname()+"\nSalary : "+getsalary()+"\nAddress : "+getAddress();
    }

    public int getID(){
        return id;
    }

    public void setID(int Id){
        id = Id;
    }

    public String getname(){
        return name;
    }

    public void setname(String Name){
        name = Name;
    }

    public double getsalary(){
        return salary;
    }

    public void setsalary(double Salary){
        salary = Salary;
    }

    public Address getAddress(){
        return address;
    }

    public void setAddress(Address address_input){
        address = address_input;
    }

}

class Address{
    protected String street;
    protected String city;

    Address(String Street, String City){
        street = Street;
        city = City;
    }

    public String toString(){
        return "\nStreet : "+getStreet()+"\nCity : "+getCity();
    }

    public String getStreet(){
        return street;
    }

    public void setStreet(String Street){
        street = Street;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String City){
        city = City;
    }

    public String getAddressinfo(){
        return "Street : "+getStreet()+"\nCity : "+getCity();
    }
}

class Manager extends Employee{
    protected String parkingNo;

    Manager(int Id, String Name, double Salary, Address address_input,String ParkingNo){
        super(Id, Name, Salary, address_input);
        parkingNo = ParkingNo;
    }

    public String getParkingNo(){
        return parkingNo;
    }

    public void setParkingNo(String ParkingNo){
        parkingNo = ParkingNo;
    }

    public String getDetails(){
        return "ID : "+getID()+"\nName : "+getname()+"\nSalary : "+getsalary()+"\nParkingNo : "+getParkingNo()+"\n------Address------"+getAddress();
    }
}


public class no5 {
    public static void main(String[] args){
        Address armAddress = new Address("wongsawang", "Bangkok");
        Employee emp = new Manager(1122, "suriya", 500000, armAddress, "1122");
        System.out.println(emp.getDetails());
    }
}
