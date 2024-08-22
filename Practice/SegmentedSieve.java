import java.util.*;

public class SegmentedSieve{
    public static void main(String[] args){
        int l = 110;
        int r = 130;

        int[] arr=  new int[r-l+1];

        Arrays.fill(arr,-1);
        for(int i = 2; i < Math.sqrt(r); i++){
            if(arr[i] == -1){
                for(int j = Math.max(i*i, (l+i-1)/i*i); j <=r; j=j+i){
                    arr[j-l] = 0; 
                }
            }
        }
        for(int i = l; i <=r; i++){ 
            if(arr[i-l] == -1){
                System.out.print(i +" ");
            }
        }
    }
}