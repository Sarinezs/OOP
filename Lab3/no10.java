package Lab3;
import java.util.Scanner ;

public class no10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int N = sc.nextInt() ,M = sc.nextInt() ;
        Light li = new Light(N,M) ;
        for(int i = 0 ;i < N ;i++){
            int plane_1 = sc.nextInt() ;
            int plane_2 = sc.nextInt() ;
            li.input_plane(i, plane_1,plane_2 );
        }
        for(int i = 0 ;i < M ;i++){
            int light = sc.nextInt() ;
            li.input_light(i, light) ;
        }
        num_light(li) ;
    }

    public static void num_light(Light li){
        int num  = 0 ;
        for(int i = 0 ; i < li.get_M() ;i++){
            for(int j = 0 ; j < li.get_N() ;j++){
                if(li.get_light_index(i) > li.get_plane_index(j*2) &&li.get_light_index(i) < li.get_plane_index(j*2 + 1)){
                    num++ ;
                }
            }
        }
        System.out.println(num);
    }
    
}
class Light {
    private int N ,M ;
    private int[] light ;
    private int[] plane ;
    Light(int N ,int M){
        light = new int[M] ;
        plane = new int[N*2] ;
        this.M = M ;
        this.N = N ;
    }
    public void input_plane(int i,int input_one ,int input_two){
        plane[i*2] = input_one ;
        plane[i*2+1] = input_two ;
    }
    public void input_light(int i,int input){
        light[i] = input ;
    }
    public int get_light_index(int i){
        return light[i] ;
    }
    public int get_plane_index(int i){
        return plane[i] ;
    }
    public int get_M(){
        return M ;
    }
    public int get_N(){
        return N ;
    }
}