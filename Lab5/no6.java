import java.util.Scanner;

public class no6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] a = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                a[i][j] = sc.nextInt();
            }
        }

        if(isConsecutiveFour(a) == true)
            System.out.print(1);
        
        else
            System.out.print(0);
    }

    public static boolean isConsecutiveFour(int[][] a){
        int n = a.length;
        int m = a[1].length;
        boolean check = false;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m-4; j++){
                if(a[i][j] == a[i][j+1] && a[i][j+1] == a[i][j+2] && a[i][j+2] == a[i][j+3]){ // check 4 ตัวแนวนอน
                    check = true;
                }
            }
        }

        for(int j = 0; j<m; j++){
            for(int i = 0; i<n-3; i++){ // -3 เพราะ ห่างจากของอาเรย์แค่3 (เรียงกัน 4 ตัว)
                if(a[i][j] == a[i+1][j] && a[i+1][j] == a[i+2][j] && a[i+2][j] == a[i+3][j]){ // check 4 ตัวแนวตั้ง
                    check = true;
                }
            }
        }

        for(int i = 0; i<n-3; i++){ // loop หาตัวทแยง ขวา มา ซ้าย
            for(int j = 3; j<m; j++){
                int s = j-1; // index ตัวทแยง
                for(int k = i+3; k<n-2+i; k++){ // loop หาตัวทแยง set ไว้ทำแค่รอบเดียว
                    // System.out.print(k+" "+s+" | ");
                    if(a[i][j] == a[k-2][s] && a[k-2][s] == a[k-1][s-1] && a[k-1][s-1] == a[k][s-2]){
                        // System.out.print(a[i][j]+" "+a[k-2][s]+" "+a[k-1][s-1]+" "+a[k][s-2]);
                        check = true;
                    }
                }
            }
        }

        for(int i = 0; i<n-3; i++){ // loop หาตัวทแยง ซ้าย มา ขวา
            for(int j = 0; j<m-3; j++){ // เปลี่ยนเป็นเริ่มจาก 0
                int s = j + 1; // เปลี่ยนจาก ลบ เป็น บวก
                for(int k = i+3; k<n-2+i; k++){
                    if(a[i][j] == a[k-2][s] && a[k-2][s] == a[k-1][s+1] && a[k-1][s+1] == a[k][s+2]){ // เปลี่ยน s จาก ลบ เป็น บวก
                        // System.out.print(a[i][j]+" "+a[k-2][s]+" "+a[k-1][s+1]+" "+a[k][s+2]);
                        check = true;
                    }
                }
            }
        }

        return check;
    }
}
