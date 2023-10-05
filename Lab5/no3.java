import java.util.ArrayList;
import java.util.Scanner;

class SortMergeList{
   
    ArrayList<Integer> Intersect(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> intersect = new ArrayList<Integer>();
        for(int i = 0; i<list2.size(); i++){
            list1.add(list2.get(i));
        }
        list1.sort(null);

        for(int i = 0; i<list1.size()-1; i++){
            int num = 0;
            if(list1.get(i) == list1.get(i+1)){
                if(num == 0){ // เก็บตัวแรก
                    intersect.add(list1.get(i));
                }
                else{ 
                    for(int j = 0; j<intersect.size(); j++){
                        if(list1.get(i) == intersect.get(j)){ // ถ้ามีตัวซ้ำจะไม่เอามาเก็บ
                            break;
                        }
                        else{ // ไม่มีตัวซ้ำ
                            intersect.add(list1.get(i));
                        }
                    }
                }
            }
        }
        print(intersect);
        return list1;
    }


    void print(ArrayList<Integer> s){
        for(int i = 0; i<s.size(); i++){
            System.out.print(s.get(i)+" ");
        }
    }
}




public class no3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SortMergeList s1 = new SortMergeList();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> m = new ArrayList<Integer>();
        // ArrayList<ArrayList<Integer>> c = new ArrayList<>() ;
        // c.add(new ArrayList<>());

        int mode = 1;
        System.out.println("enter list1: ");
        while(true){    
            mode = sc.nextInt();
            if(mode == 0){
                break;
            }
            else{
                list1.add(mode);
            }
        }
        System.out.println("enter list2: ");
        while(true){    
            mode = sc.nextInt();
            if(mode == 0){
                break;
            }
            else{
                list2.add(mode);
            }
        }
        s1.Intersect(list1, list2);
        // s1.print(list1);
        // System.out.println("");
        // s1.print(list2);

    }
}
