import java.util.*;
public class Leader {
    public static ArrayList<Integer> leader(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] isLeader = new boolean[arr.length];
        
        for (int i = 0; i < arr.length - 1; i++) {
            boolean leader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] >= arr[i]) {
                    leader = false;
                    break;  
                }
            }
            if (leader) {
                isLeader[i] = true;
            }
        }
        
        isLeader[arr.length - 1] = true;
        
        for (int i = 0; i < arr.length; i++) {
            if (isLeader[i]) {
                list.add(arr[i]);
            }
        }
        
        return list;
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 3, 1};
        System.out.println(leader(arr)); 
    }
}
