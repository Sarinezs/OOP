import java.util.Scanner;

class find_way{
    Scanner sc = new Scanner(System.in);
    private int[][] road;
    private int[] decision;
    find_way(){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();
        road = new int[m][n];
        decision = new int[m];

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                road[i][j] = sc.nextInt();
            }
        }
        
        Change_lane(t-1, -1, 0);
        for(int i = 0; i<t; i++){
            System.out.println(decision[i]);
        }
    }

    public boolean Change_lane(int n, int m, int num){
        if(n - 1 >= 0 && m + 1 < road.length){
            if(road[m+1][n-1] == 0 && Change_lane(n-1, m+1, num+1)){
                decision[num] = 1;
                return true;
            }
        }
        if(n + 1 < road[0].length && m + 1 < road.length){
            if(road[m+1][n+1] == 0 && Change_lane(n+1, m+1, num+1)){
                decision[num] = 2;
                return true;
            }
        }
        if(m + 1 < road.length){
            if(road[m+1][n] == 0 && Change_lane(n, m+1, num+1)){
                decision[num] = 3;
                return true;
            }
        }
        if(m == road.length-1){
            return true;
        }
        return false;
    }
   
}

public class no10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        find_way a = new find_way();
        
    }
}
