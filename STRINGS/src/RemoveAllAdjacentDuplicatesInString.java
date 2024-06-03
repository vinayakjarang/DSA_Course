public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String s="abbaca";
        int low=0;
        int high=1;
        while(high<=s.length()-1){
            if(s.charAt(low)!=s.charAt(high)){
                low++;
                high++;
            }
            else{
                s=removee(s,low,high);
                low=0;
                high=1;
            }
        }
        System.out.println(s);
    }

    private static String removee(String s, int low, int high) {
        String l=s.substring(0,low);
        String m=s.substring(high+1);
        s=l+m;
        return s;
    }
}
