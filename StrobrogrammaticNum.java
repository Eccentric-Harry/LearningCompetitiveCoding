import java.util.*;
public class StrobrogrammaticNum{
    public static boolean isTrue(String num){
        int n = num.length();
        int l = 0;
        int r = n-1;
        HashMap<Character, Character> map = new HashMap<>();
        map.put('0','0');
        map.put('1','1');
        map.put('6','9');
        map.put('8','8');
        map.put('9','6');
        while(l <=r){
            if(!map.containsKey(num.charAt(l))) return false;
            if(map.get(num.charAt(l))!=num.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args){
        String n = "10";
        System.out.println(isTrue(n));
    }
}