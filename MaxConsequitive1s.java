import java.util.*;
public class MaxConsequitive1s {
    public static void max1s(int n) {
        int c = 0;  
        int prevCount = 0;  
        int max = 0;  
        while (n != 0) {
            if ((n & 1) == 1) {
                c++; 
            } else {
                prevCount = (n & 2) != 0 ? c : 0;
                c = 1;  
            }
            max = Math.max(max, prevCount + c);
            n = n >> 1; 
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        max1s(n);
    }
}
