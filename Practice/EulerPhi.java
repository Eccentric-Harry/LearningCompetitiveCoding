public class EulerPhi{
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
    public static int phi(int n){
        int c = 1;
        for(int i = 2; i <n; i++){
            if(gdc(i , n) == 1){
                c++;
            }
        }
        return c;
    }
}