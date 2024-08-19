public class Fibonacci{
    public static void fibo(int n){
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        int i = 2;
        while(i < n){
            int c = a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
            i++;
        }
    } 
    public static void main(String[] args){
        int n = 10;
        // fibo(n);
        System.out.print(fiboRecursion(n));
    }
    public static int fiboRecursion(int n){
        if(n < 2){
            return n;
        }
        return fiboRecursion(n-1) + fiboRecursion(n-2);
    }
}