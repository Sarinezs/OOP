class Circle extends GeometricObject implements Comparable<Circle>{
    double radius;

    Circle(double Radius){
        radius = Radius;
    }

   @Override
    public boolean equals(Object a) {
        if (a instanceof Circle) {
            Circle otherCircle = (Circle) a;
            return this.radius == otherCircle.radius;
        }
        return false;
    }

    @Override
    public int compareTo(Circle otherCircle) {
        if(this.radius == otherCircle.radius){
            return 1;
        }
        return 0;
    }

    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*radius;
    }
}

public class no5_1{
    public static void main(String[] args){
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(10);

        if(c1.equals(c2)){
            System.out.println("c1.equals(c2):\nc1's radius == c2's radius");
        }
        else{
            System.out.println("c1.equals(c2):\nc1's radius != c2's radius");
        }

        System.out.println();

        if(c1.compareTo(c2) == 1){
            System.out.println("c1.compareTo(c2):\nc1's radius == c2's radius");
        }
        else{
            System.out.println("c1.compareTo(c2):\nc1's radius != c2's radius");
        }

        System.out.println();


        System.out.println("c1's area = "+c1.getArea());
        System.out.println("c2's area = "+c2.getArea());
        System.out.println("c1's perimeter = "+c1.getPerimeter());
        System.out.println("c2's perimeter = "+c2.getPerimeter());
    }
}