
class Rectangle extends GeometricObject implements Comparable<Rectangle>{
    int w;
    int h;
    int area;

    Rectangle(int w, int h){
        this.w = w;
        this.h = h;
        this.area = w*h;
    }

    @Override
    public boolean equals(Object a){
        if(a instanceof Rectangle){
            Rectangle otherRectangle = (Rectangle)a;
            return this.area == otherRectangle.area;
        }
        return false;
    }

    @Override
    public int compareTo(Rectangle otherRectangle) {
        if(this.area == otherRectangle.area){
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
        return 2*w + 2*h;
    }

}


public class no5_2 {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(5,5);
        Rectangle r2 = new Rectangle(10,1);

        if(r1.equals(r2)){
            System.out.println("r1.equals(r2):\nr1's area == r2's area");
        }
        else{
            System.out.println("r1.equals(r2):\nr1's area != r2's area");
        }

        System.out.println();

        if(r1.compareTo(r2) == 1){
            System.out.println("r1.compareTo(r2):\nr1's area == r2's area");
        }
        else{
            System.out.println("r1.compareTo(r2):\nr1's area != r2's area");
        }

        System.out.println();


        System.out.println("r1's area = "+r1.getArea());
        System.out.println("r2's area = "+r2.getArea());
        System.out.println("r1's perimeter = "+r1.getPerimeter());
        System.out.println("r2's perimeter = "+r2.getPerimeter());
    }
}

