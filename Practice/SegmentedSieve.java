import java.util.*;
public class SegmentedSieve{
    static int n = 1000000;
    static boolean[] box = new booolean[n+1];

    static void generateSieve(){
        Arrays.fill(box, true);
        for(int i = 2; i*i <=n; i++){
            if(box[i]){
                for(int j = i*i; j <=n; j+=i){
                    box[j] = false;
                }
            }
        }
    }

    static List<Integer> markPrime(int n){
        List<Integer> ans = new ArrayList<>();
        for(int i = 2; i<=n; i++){
            if(box[i]){
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int l = 2;
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        generateSieve();
        List<Integer> markPrime = getMarkprime((int) Math.sqrt(r));

        if((r-1) > 1000000){
            return;
        }

        int[] dummy = new int[r-l+1];
        Arrays.fill(dummy,1);

        for(int pr: markPrime){
            int firstMul = (l/pr)*pr;
            if(firstMul < 1){
                firstMul+=pr;
            }

            for(int i = Math.max(firstMul, (pr*pr)); i <=r; i+=pr){
                dummy[i-l] = 0;
            }
        }

        for(int i = l; i <=r; i++){
            if(dummy[i-l]==1){
                System.out.print(i+" ");
            }
        }
    }
}