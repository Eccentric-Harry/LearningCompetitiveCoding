public class StringtoBinary{
    public static int stringtodecimal(String str){
        int ans = 0;
        int y = 0;
        for(int i = str.length()-1; i >=0; i--){
            char ch = str.charAt(i);
            if(ch == '0'){
                y++;
            }else{
                ans+= Math.pow(2,y);
                y++;
            }
        }
        return ans;
    }
    public static void main(String[] arg){
        String str = "11110011011101";
        System.out.println(stringtodecimal(str));
    }
}