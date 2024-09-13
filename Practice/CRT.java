import java.util.*;
public class CRT{
    public static int crt(int[] a, int[] m, int k){
        int x = 1;
        int j; 
        while(true){
            for(j = 0; j < k; j ++){
                if(x%m[j]!=a[j]){
                    break;
                }
            }
            if(j==k){
                return x;
            }
            x++;
        }
    }
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] a = new int[k];
        int[] m = new int[k];
        for(int i = 0; i < k; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < k; i++){
            m[i] = sc.nextInt();
        }
        System.out.println(crt(m, a, k));
    }
}
