import java.util.Scanner;

public class l1n9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int max = 0;
        System.out.println("input Number: ");
        int a = sc.nextInt();
        while(a!=0){
            if(a > max){
                n = 1;
                max = a;
            }
            else if(a == max){
                n++;
            }
            a = sc.nextInt();
        }
        System.out.println(max+" "+n);
    }   
}
