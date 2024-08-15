import java.util.*;
public class Primes {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        
        for (int i = 2; i<= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;  
            }
        }
        
        return true; 
    }
    public static List<Integer> primes(int n){
        List<Integer> list = new ArrayList<>();
        for(int i = 2; i < n+1; i++){
            if(isPrime(i)){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int n = 21;
        System.out.println(primes(n));  
    }
}
