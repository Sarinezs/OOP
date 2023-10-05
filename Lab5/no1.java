// package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class no1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> m = new ArrayList<Integer>();
        int[][] a = new int[3][3];
        int input = 1;
        int num = 0;
        double sum = 0;
        int max = 0;
        int min = 0;

        while(true){
            input = sc.nextInt();
            if(input == 0){
                break;
            }
            if(num == 0){
                min = input;
                max = input;
            }
            sum += input;
            if(input > max){
                max = input;
            }
            if(input < min){
                min = input;
            }
            if((input % 2) != 0){
                m.add(input);
            }
            // else{
            //     a[i][j] = 0;
            // }
            num++;
        }
        
        double mean = sum / 50;
        System.out.print(String.format("%.2f", mean)+"\n"+max+"\n"+min+"\n");
        for(int i =0; i < m.size(); i++){
            System.out.print(m.get(i)+" ");
        }
    }
}
