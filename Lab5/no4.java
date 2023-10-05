import java.util.Scanner;

public class no4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int k = sc.nextInt();
        int[][] a = new int[rows][cols];
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                a[i][j] = sc.nextInt(); 
            }
        }

        int m = a.length;
        int n = a[1].length;
        int max_sum = 0;

        for(int i = 0; i<m-(k-1); i++){ // กำหนดขอบเขตคอลัมภ์
            for(int j = 0; j<n-(k-1); j++){ // กำหนดขอบเขตแถว
                int sum = 0;
                for(int t = i; t<k+i; t++){ // r and t คือ สี่เหลี่ยมเล็กเอาไว้หาผลรวม
                    for(int r = j; r<k+j; r++){
                        sum += a[t][r];
                        if(sum > max_sum){
                            max_sum = sum;
                            // System.out.println(t+" "+r);
                        }
                    }
                }
            }
        }
        System.out.print(max_sum);
    }
}
