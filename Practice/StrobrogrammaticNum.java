import java.util.Scanner;
public class StrobrogrammaticNum {
    public static void  Stobogrammatic(int n) {
            int start = (int) Math.pow(10, n - 1);
            int end = (int) Math.pow(10, n);
            for (int i = start; i < end; i++) {
                String s="";
                String s1=Integer.toString(i);
                for(int j=0;j<s1.length();j++){
                    char c=s1.charAt(j);
                    if(c=='0') s='0'+s;
                    if(c=='1') s='1'+s;
                    if(c=='9') s='6'+s;
                    if(c=='8') s='8'+s;
                    if(c=='6') s='9'+s;
                }
                if(s1.equals(s)){
                    System.out.print(s1+" ");
                }
            }
        }
        public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            Stobogrammatic (n);
    }
}