import java.util.Scanner;

class MatrixMultiplication{
    
    public void matrixcheck(int[][] a, int[][] b){
        if(a[0].length == b.length){
            // System.out.println("Can multiply Matrix");
            multiplymatrix(a, b);
        }
        else{
            System.out.println("Can't multiply Matrix");
        }
    }

    public void multiplymatrix(int[][] a, int[][] b){
        int n = a.length;
        int m = b[0].length;
        int sum_loop = b.length; // number of loop for save value of sum
        int[][] solution = new int[n][m];

        for(int i = 0; i<n; i++){
            for(int j = 0 ; j<m; j++){
                int sum = 0;
                for(int k = 0; k<sum_loop; k++){
                    sum += a[i][k]*b[k][j];
                }
                solution[i][j] = sum;
            }
        }
        printmatrix(solution);
    }

    public void printmatrix(int[][] solution){
        int n = solution.length;
        int m = solution[0].length;

        for(int i = 0; i<n; i++){
            for(int j = 0 ; j<m; j++){
                System.out.print(solution[i][j]+" ");
            }
                System.out.println();
        }
    }
}

public class no5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MatrixMultiplication obj = new MatrixMultiplication();

        int n = sc.nextInt();
        int m = sc.nextInt();
        int value;
        int[][] a = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                value = sc.nextInt();
                a[i][j] = value;
            }
        }
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] b = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                value = sc.nextInt();
                b[i][j] = value;
            }
        }

        obj.matrixcheck(a, b);

    }
}
