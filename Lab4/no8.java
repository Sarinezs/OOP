import java.util.Scanner;

public class no8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] a = new int[H][W];

        for(int i = 0; i<H; i++){
            for(int j = 0; j<W; j++){
                a[i][j] = sc.nextInt();
            }
        }

        int n = a.length;
        int m = a[1].length;
        int max_sum = 0;
        int[] coordinate = new int[2];
        for(int i = 0; i<n-1; i++){
            int k = i;
            for(int j = 0; j<m; j++){
                if((a[k][j] + a[k+1][j]) > max_sum && Math.abs(a[k][j] - a[k+1][j]) <= 10){
                    max_sum = a[k][j] + a[k+1][j];
                    coordinate[0] = k;
                    coordinate[1] = j;
                    // System.out.print(k+","+j+" | "+(k+1)+","+j+"\n");
                }
            }
        }
        // int array_index
        System.out.print((coordinate[0]+1)+" "+(coordinate[1]+1));

    }
}
