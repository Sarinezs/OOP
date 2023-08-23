// package week3;

import java.util.Scanner;

class MatrixMultiplication{
    Scanner sc = new Scanner(System.in);
    boolean check(int[][] a, int[][] b){
        if(a[1].length == b.length)
            return true;
        else{
            return false;
        }
    }

    int[][] AxB(int[][] a, int[][] b){
        int n = a.length;
        int m = b[1].length;
        int l = b.length;
        int[][] c = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int sum =0;
                for(int k = 0; k < l; k++){
                    sum += a[i][k]*b[k][j];
                    // System.out.print(sum+" ");
                }
                c[i][j] = sum;
            }
        }
        return c;
    }
}

public class l4n5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] a,b;
        int n,m,x,y;
        MatrixMultiplication m1 = new MatrixMultiplication();

        // int[][] a = {{1,2},{-1,0},{3,2}};
        // int[][] b = {{1,5,2},{-2,0,1}};

        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[n][m];
        for(int i = 0; i< n; i++){
            for(int j =0 ; j< m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        
        x = sc.nextInt();
        y = sc.nextInt();
        b = new int[x][y];
        for(int i = 0; i< x; i++){
            for(int j =0 ;j < y; j++){
                b[i][j] = sc.nextInt();
            }
        }

        int[][] ans = m1.AxB(a, b);

        for(int i = 0; i< n; i++){
            for(int j =0 ;j < y; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
