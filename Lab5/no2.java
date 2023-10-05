import java.util.ArrayList;
import java.util.Scanner;

class Star{

    ArrayList<String> addstar(ArrayList<String> s){
        ArrayList<String> s1 = new ArrayList<String>();
        for(int i = 0; i< s.size(); i++){
            s1.add(s.get(i));
            s1.add("*");
        }
       

        return s1;
    }

    ArrayList<String> removestar(ArrayList<String> s){
        for(int i = 1; i < s.size(); i=i+1){
            if(s.get(i) == "*"){
                s.remove(i);
            }
        
        }

        return s;
    }
}

public class no2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> e1 = new ArrayList<String>();
        Star obj = new Star();
        int m,n;
        n = sc.nextInt();
        m = sc.nextInt();

        for(int i = 0; i<n; i++){
            String data = sc.next();
            e1.add(data);
        }

        for(int j = 0; j<m; j++){
            int mode = sc.nextInt();
            if(mode == 1){
                e1 = obj.addstar(e1);
                System.out.print("[");
                for(int i = 0 ;i < e1.size(); i++){
                    if(i == e1.size()-1){
                        System.out.print(e1.get(i));
                        continue;
                    }
                    System.out.print(e1.get(i)+", ");
                }
                System.out.println("]");
            }
            else if(mode == 2){
                e1 = obj.removestar(e1);
                System.out.print("[");
                for(int i = 0 ;i < e1.size(); i++){
                    if(i == e1.size()-1){
                        System.out.print(e1.get(i));
                        continue;
                    }
                    System.out.print(e1.get(i)+", ");
                }
                System.out.println("]");
            }
        }
    }
}
