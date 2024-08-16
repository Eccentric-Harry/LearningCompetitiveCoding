public class EulerPhiAlgo{
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }

    public static int phi(int n){
        int count = 1;
        for(int i = 2; i < n; i++){
            if(gcd(i,n)==1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
            int n;
            for (n = 1; n <= 10; n++){
            System.out.println("phi(" + n + ") = " + phi(n));
            }
    }
}