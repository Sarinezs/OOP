import java.util.Scanner;

class find_oil{
    private char position[][];
    private int num;
    find_oil(int m, int n){
        Scanner sc = new Scanner(System.in);
        position = new char[m][n];
        for(int i = 0; i<position.length; i++){
            for(int j = 0; j<position[i].length; j++){
                position[i][j] = sc.next().charAt(0);
            }
        }
       
    }

    public int number_of_oil_fields(){
        for(int i = 0; i<position.length; i++){
            for(int j = 0; j<position[i].length; j++){
                if(change_oil_to_dirt(i, j)){
                    oil_check(i, j);
                    num++;
                }
            }
        }
        return num;
    }

    public boolean change_oil_to_dirt(int m ,int n){
        if(position[m][n] == '@'){
            position[m][n] = '*';
            return true;
        }
        return false;
    }

    public void oil_check(int m, int n){
        if(m-1 >= 0 && n+1 < position[0].length){
            if(change_oil_to_dirt(m-1, n+1)){
                oil_check(m-1, n+1);
            }
        }
        if(m-1 >= 0){
            if(change_oil_to_dirt(m-1, n)){
                oil_check(m-1, n);
            }
        }
        if(m-1 >= 0 && n-1 >= 0){
            if(change_oil_to_dirt(m-1, n-1)){
                oil_check(m-1, n-1);
            }
        }
        if(n-1 >= 0){
            if(change_oil_to_dirt(m, n-1)){
                oil_check(m, n-1);
            }
        }
        if(m+1 < position.length && n-1 >= 0){
            if(change_oil_to_dirt(m+1, n-1)){
                oil_check(m+1, n-1);
            }
        }
        if(m+1 < position.length){
            if(change_oil_to_dirt(m+1, n)){
                oil_check(m+1, n);
            }
        }
        if(m+1 < position.length && n+1 < position[0].length){
            if(change_oil_to_dirt(m+1, n+1)){
                oil_check(m+1, n+1);
            }
        }
        if(n+1 < position[0].length){
            if(change_oil_to_dirt(m, n+1)){
                oil_check(m, n+1);
            }
        }
    }

}


public class no11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        find_oil oil = new find_oil(m, n);
        int number_of_oil = oil.number_of_oil_fields();
        System.out.print(number_of_oil);
    }
}
