package Lab3;
import java.util.Scanner ;
public class no8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int num = sc.nextInt() ;
        System.out.println(String.format("%.4f",pi(num))) ;
    }
    public static double pi(int num){
        double result = 0;
        for(int i = 1 ; i <= num ;i++){
          result += (Math.pow(-1 ,i+1)/(2.0*i-1.0)) ;
        }
        result *= 4 ;
        return result ;
    }
    
}
