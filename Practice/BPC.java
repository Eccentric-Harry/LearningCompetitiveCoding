public class BPC{
    public static boolean bpc(int n){
        int o = n;
        int r = 0;
        while(o > 0){
            r = r << 1;
            r = r | (o & 1);
            o = o >> 1;
        }
        if(r == n){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int n = 8;
        System.out.println(bpc(n));
    }
}