import java.util.*;
public class SGN{
    public static boolean check(String num){
        int l = 0; 
        int r = num.length()-1;

        Map<Character, Character> mpp = new HashMap<>();
        mpp.put('1', '1');
        mpp.put('0', '0');
        mpp.put('6', '9');
        mpp.put('9', '6');
        mpp.put('8', '8');

        while(l<=r){
            if(!mpp.containsKey(num.charAt(l))) return false;
            if(mpp.get(num.charAt(l))!= num.charAt(r)){
                return false;
            }
            l++;
            r--;
            
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(check(sc.next()));
    }
}