import java.util.*;
public class SimpleSieve{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n+1];
        Arrays.fill(arr, -1);
        for(int i = 2; i*i <=n; i++){
            if(arr[i]==-1){
                for(int j = i*i; j<=n; j+=i){
                    arr[j] = 1;
                }
            }
        }

        for(int i= 2; i <=n; i++){
            if(arr[i]==-1){
                System.out.print(i+" ");
            }
        }
    }
}       