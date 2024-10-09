import java.util.*;
public class MaxCons1s{
    public static int max1s(int n){
        int current = 0;
        int max = 0;
        while(n!=0){
            if((n&1)==1){
                current++;
                max = Math.max(max,current);
            }else if((n&1)==0){
                if((n&2) == 1){
                    current+=2;
                    max = Math.max(max,current);
                }
            }else{
                current = 0;
            }
            n = n >>1;
        }
        return max;
    }
    
}