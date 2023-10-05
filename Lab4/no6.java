import java.util.Scanner;

public class no6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double x ;
        double[][] coordinate = new double[n][2]; 
        for(int i = 0; i<n; i++){
            for(int j = 0; j<2; j++){
                x = sc.nextDouble();
                coordinate[i][j] = x;
            }
        }
        double distant;
        double minimum_distant = 999;
        for(int i = 0; i<n-1; i++){
            for(int j = i; j<n; j++){
                if(i == j){
                    continue;
                }
                distant = Math.sqrt(Math.pow(coordinate[i][0] - coordinate[j][0],2) + Math.pow(coordinate[i][1] - coordinate[j][1],2));

                if(distant < minimum_distant){
                    minimum_distant = distant;
                }
                // System.out.print(String.format("%.2f", distant)+" | ");
                
            }
            // System.out.println("\n");
        }
        System.out.println(String.format("%.2f", minimum_distant));
    
    }
}

