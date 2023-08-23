// package week2;

import java.util.Scanner;

class primecheck{
    private int number = -1;
    primecheck(){}
    public void primecheck(int n){
        if((n == 1 || n%2 == 0 || n%3 == 0 || n%5 == 0 || n%7 == 0)
            && (n!=2 && n!=3 && n!=5 && n!=7)){
                
            }
        else{
            if(number < n){
                this.number = n;
            }
        }
    }

    public int getprime(){
        return number;
    }
}
public class l2n9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        primecheck check = new primecheck();
        int n = 1;
        // int i = 1;
        while(n != 0){
            n = sc.nextInt();
            check.primecheck(n);
        }
        System.out.println("prime number is : "+check.getprime());
    }
}
