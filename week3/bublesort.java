public class bublesort {
    public static void main(String[] args){
        int[] a = {2,54,2,67,1,7,3,5,8,14,24,23,52,0};

        int n = a.length;
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(a[j] < a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }

        for(int i = 0; i<n; i++){
            System.out.print(a[i]+" ");
        }


    }
}
