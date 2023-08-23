import java.util.Scanner;

public class l2n7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x1,y1,w1,h1,x2,y2,w2,h2;
        System.out.print("Enter r1's center x y coordinates, width adn height: ");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        w1 = sc.nextDouble();
        h1 = sc.nextDouble();
        System.out.print("Enter r2's center x y coordinates, width adn height: ");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        w2 = sc.nextDouble();
        h2 = sc.nextDouble();

        if(((Math.abs(x2-x1) + w2/2)<=w1/2) && ((Math.abs(y2-y1) + h2/2)<=h1/2)){
            System.out.println("r2 is inside r1");
        }
        else if((Math.abs(x2-x1) <= w1+w2) && (Math.abs(y2-y1) <= h1+h2)){
            System.out.println("r2 is overlaps r1");
        }
        else{
            System.out.println("r2 isn't inside r1");
        }
    }
}
