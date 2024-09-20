import java.util.*;
public class BlockSwap{
    public static int[] rotateArray(int[] arr, int k){
        int n = arr.length;
        k = n%k;
        if(k==0){
            return arr;
        }
        int[] newArr = new int[n];
        int x = 0;
        for(int i = k; i <n; i++){
            newArr[x] = arr[i];
            x++;
        }
        for(int i = 0; i <k ;i++){
            newArr[x] = arr[i];
        }
        return newArr;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int k = 2;  
        int[] newArr = rotateArray(arr,k);

        System.out.println(Array.toString(newArr));
    }
}