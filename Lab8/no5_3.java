
class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable{
    double side;
    double area;

    Octagon(int side){
        this.side = side;
        this.area = (2+(4/Math.sqrt(2)))*side*side;
    }

    @Override
    public boolean equals(Object a){
        if(a instanceof Octagon){
            Octagon otherOctagon = (Octagon)a;
            return this.area == otherOctagon.area;
        }
        return false;
    }

    @Override
    public int compareTo(Octagon otherOctagon) {
        if(this.area == otherOctagon.area){
            return 1;
        }
        return 0;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPerimeter() {
        return 8*side;
    }

}


public class no5_3 {
    public static void main(String[] args){
        Octagon o1 = new Octagon(5);
        Octagon o2 = new Octagon(10);

        if(o1.equals(o2)){
            System.out.println("o1.equals(o2):\no1's area == o2's area");
        }
        else{
            System.out.println("o1.equals(o2):\no1's area != o2's area");
        }

        System.out.println();

        if(o1.compareTo(o2) == 1){
            System.out.println("o1.compareTo(o2):\no1's area == o2's area");
        }
        else{
            System.out.println("o1.compareTo(o2):\no1's area != o2's area");
        }

        System.out.println();


        System.out.println("o1's area = "+o1.getArea());
        System.out.println("o2's area = "+o2.getArea());
        System.out.println("o1's perimeter = "+o1.getPerimeter());
        System.out.println("o2's perimeter = "+o2.getPerimeter());
    }
}

