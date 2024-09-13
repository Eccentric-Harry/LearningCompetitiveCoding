public class MaxConsequitive1s {
    public static void max1s(int n) {
        int c = 0;  
        int t = n;
        int prevCount = 0;  
        int max = 0;  
        while (n != 0) {
            if ((n & 1) == 1) {
                c++; 
            } else {
                prevCount = (n & 2) != 0 ? c : 0;
                c = 0;  
            }
            max = Math.max(max, prevCount + c + 1);
            n = n >> 1; 
        }
        System.out.println(max + " " + Integer.toBinaryString(t));
    }
    public static void main(String[] args) {
        int n = 15581;
        max1s(n);
    }
}
