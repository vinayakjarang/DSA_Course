import java.util.ArrayList;
import java.util.Arrays;

public class LongestPalinSubString {
    public static void main(String[] args) {
        String s = "abba";
//        ArrayList<String> ar=new ArrayList<>();
        String [] ar=new String[1];
        ar[0]=String.valueOf(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            arra(s,i,ar);
        }
        System.out.println(Arrays.toString(ar));
        System.out.println(ar.length);
        int max=0;
        String res="";
//        for (int i = 0; i < ar.size(); i++) {
//            System.out.println("for "+ar.get(i));
//            if(palin(ar.get(i))){
//                String s1=ar.get(i);
//                System.out.println("s1 "+s1);
//                if(s1.length()>max){
//                    max=s1.length();
//                    res=s1;
//                }
//            }
//            else{
//                continue;
//            }
//        }
        System.out.println(res);
    }
    private static boolean palin(String s) {
        int low=0;
        int high=s.length()-1;
        while(low<=high){
            char ch1=s.charAt(low);
            char ch2=s.charAt(high);
            if(ch1==ch2){
                low++;
                high--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    private static void arra(String s, int i,String[] ar) {
        String sr="";
        int max=0;
        for (int j=i;j<s.length();j++){
            sr+=s.charAt(j);
            if(palin(sr)){
                System.out.println(sr);
                if(sr.length()>ar[0].length()){
                    ar[0]=sr;
                }

            }
        }
    }
}
