//import java.util.ArrayList;
//
//class Solution {
//    public String longestCommonPrefix(String[] strs) {
//        if(strs.length==1){return strs[0];}
//        ArrayList<String> sb=new ArrayList<String>();
//        String s="";
//        for(int i=0;i<strs.length-1;i++){
//            sb.add(prifix(strs[i],strs[i+1],s));
//        }
//        int min=200;
//        String gh="";
//        for (String ss:sb){
//            if(min>ss.length()){
//                min=ss.length();
//                gh=ss;
//            }
//        }
//        return gh;
//    }
//    String prifix(String a,String b,String s){
//        int m=a.length();
//        int n=b.length();
//        int count=0;
//        int p=Math.min(m,n);
//        for(int i=0;i<p;i++){
//            if(a.charAt(i)==b.charAt(i)){
//                s+=a.charAt(i);
//            }
//            else{
//                break;
//            }
//        }
//        return s;
//    }
//}














public class LongestCommonPrifix {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder();
        String [] ss={"flower","flow","flight"};
        String frst=ss[0];
        String lst=ss[ss.length-1];
        for(int i=0;i<Math.min(frst.length(),lst.length());i++){
            if(frst.charAt(i)==lst.charAt(i)){
                sb.append(frst.charAt(i));
            }
            else{
                break;
            }
        }
        System.out.println(sb);
    }
}







