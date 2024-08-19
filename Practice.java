import java.util.*;
public class Practice{
    public static void simpleSieve(int n){
        int arr[] = new int[n+1];
        Arrays.fill(arr,1);

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(arr[i]==1){
                for(int j = i*i; j<=n ; j = j+i){
                    arr[j] = 0;
                }
            }
        }
        for(int i = 2; i < n; i++){
            if(arr[i] == 1){
                System.out.print(i + " ");
                
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        simpleSieve(21);
        segmentedSieve(110, 130);
    }
    public static void segmentedSieve( int l, int r){
        int n = r-l+1;

        int[] arr = new int[n];
        Arrays.fill(arr, 1);

        for(int i = 2; i < Math.sqrt(r); i++){
            if(arr[i] == 1){
                for(int j = Math.max(i*i, (l+i-1)/i*i); j<=r; j+=i){
                    arr[j-l] = 0;
                }
            }
        }

        for(int i = l; i<=r; i++){
            if(arr[i-l] == 1){
                System.out.print(i + " ");
            }
        }
    }
}