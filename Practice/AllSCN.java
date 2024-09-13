import java.util.*;
public class AllSCN{
    public static void generate(int n){
        int start = (int) Math.pow(10,n-1);
        int end = (int)  Math.pow(10,n);

        for(int i =start; i < end; i++){
            String s = "";
            String s1 = Integer.toString(i);
            for(int j = 0; j< s1.length(); j++){
                char ch = s1.charAt(j);
                if(ch =='0') s =  '0'+ s;
                if(ch =='1') s = '1'+s;
                if(ch =='6') s = '9'+s;
                if(ch =='9') s = '6'+s;
                if(ch =='8') s =  '8'+s;
            }
            if(s1.equals(s)){
                System.out.print(s1+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        generate(sc.nextInt());
    }
}