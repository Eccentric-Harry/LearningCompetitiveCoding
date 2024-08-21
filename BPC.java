public class BPC{
    public static boolean isTrue(int n){
        int r = 0;
        int o = n;
        while(n > 0){
            r <<=1;
            r |= (n&1);
            n >>= 1;
        }
        if(r == o){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int n = 9;
        if(isTrue(n)){
            System.out.println(n + " has a binary palindrome representation.");
        }else{
            System.out.println(n + " does not have a binary palindrome representation.");
        }
    }
}