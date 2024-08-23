public class CRT{
    public static int crt(int[] a, int[] m, int k){
        int x = 1;
        int j; 
        while(true){
            for(j = 0; j < k; j ++){
                if(x%m[j]!=a[j]){
                    break;
                }
            }
            if(j==k){
                return x;
            }
            x++;
        }
    }
        public static void main(String[] args){
        int[] a = {2,3,2};
        int[] m = {3,5,7};
        int k = a.length;
        System.out.println("x is " + crt(a, m, k));
    }
}