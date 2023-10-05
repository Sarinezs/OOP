import java.util.Scanner;

public class l1n8 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double n,a0,a1;
    System.out.print("Please input n a0 and a1 ");
    n = sc.nextDouble();
    a0 = sc.nextDouble();
    a1 = sc.nextDouble();

    System.out.print(a0+" "+a1+" ");
    for(int i = 2; i<=(n);i++){
        double ai = ((Math.pow(i, 2)*a1) - a0) + Math.pow(3,i);
        a0 = a1;
        a1 = ai;
        System.out.print(ai+" ");
    }
    }
}
