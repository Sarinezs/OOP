
public class inclass {

    public static void main(String[] args) {
//        calculation obj = new calculation();
       calculation_v1 obj1 = new calculation_v1();
//        
//        obj.addition(1, 2);
//        System.out.println(obj);
//        
    //    obj1.addition(2, 2);
       System.out.println(obj1);
    //    obj1.multiplication(5, 5);
       System.out.println(obj1);
    
//        point x1 = new point(1,2);
//        x1.setx(10);
//        x1.sety(20);
//        System.out.println(x1);
        // point3d x2 = new point3d(1,2,3);
        // System.out.println(x2);
    }
    
}

class calculation{ // extend Object automatically or inheritance from Object
    protected int z; // subclass can use this variable
    public void addition(int x , int y){
        z = x+y;
        System.out.println("Z = "+z);
    }
    
    public void substraction(int x , int y){
        z = x - y;
        System.out.println("Z = "+z);
    }
    @Override
    public String toString(){
        return "Ans="+z;
    }
}

class calculation_v1 extends calculation{
    public void multiplication(int x , int y){
        z = x * y;
        System.out.println("Z = "+z);
    }
    public void division(int x , int y){
        z = x/y;
        System.out.println("Z = "+z);
    }
    @Override
    public String toString(){
        return "In subclass:"+super.toString(); // use Override from superclass
    }
}

class point{
    private int x; // private: only can only use in this class
    private int y;
    point(){
        this.x = 0; 
        this.y = 0; 
    }
    point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getx(){
        return this.x;
    }
    public void setx(int x){
        this.x = x;
    }
    public int gety(){
        return this.y;
    }
    public void sety(int y){
        this.y = y;
    }
    @Override
    public String toString(){
        return "x = "+this.x+" y = "+this.y; // can use x y. no "this." cuz in x,y are in same class
    }
}

class point3d extends point{
    private int z;
    point3d(){
        super();
        z = 0; // or use this.z
    }
    point3d(int x, int y, int z){
        super(x,y); // call superclass to intialize value x,y subclass can't set it
        this.z = z;
    }
    public int getz(){
        return this.z;
    }
    public void setz(int z){
        this.z = z;
    }
    @Override
    public String toString(){
//        return super.toString()+" z = "+ z;
        return "x = "+super.getx()+" y = "+super.gety()+" z = "+z;
    }
}
    
