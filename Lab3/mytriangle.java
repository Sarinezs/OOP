// package Lab3;

import java.util.Scanner;

public class mytriangle {
    public boolean isValid(double side1, double side2, double side3){
        if(side1 + side2 > side3){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        mytriangle t1 = new mytriangle();

        System.out.println("enter sides of triangle : ");
        double side1 = sc.nextInt();
        double side2 = sc.nextInt();
        double side3 = sc.nextInt();


        if(t1.isValid(side1, side2, side3) == true)
            System.out.println(String.format("%.2f",t1.area(side1, side2, side3)));
        else{
            System.out.println(0);
        }
    }

    public double area(double side1, double side2, double side3){
        double area;
        double s = (side1 + side2 + side3)/2;

        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        
        return area;
    }
}
