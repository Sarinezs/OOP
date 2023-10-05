public class RegularPolygon {
    private int n;
    private double side,x,y;
    RegularPolygon(){
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
    }

    RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side =side;
        this.x = x;
        this.y = y;
    }

    double getPerimeter(){
        return n*side;
    }
    
    double getArea(){
        return (n*(Math.pow(side,2))) / 4 * Math.tan(Math.toRadians(180 / n));
    }

    public static void main(String[] args){
        RegularPolygon r1 = new RegularPolygon();
        RegularPolygon r2 = new RegularPolygon(6,4);
        RegularPolygon r3 = new RegularPolygon(10,4,5.6,7.8);

        System.out.println(r3.getArea());
    }
}
