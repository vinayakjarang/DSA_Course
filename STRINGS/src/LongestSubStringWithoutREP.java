public class LongestSubStringWithoutREP {
    public static void main(String[] args) {
        String s = "pwwkew";
        int len=0;
        String [] arr=new String[20];
        for(int i=0; i<s.length();i++){
            String sr="";
            for (int j = i; j < s.length(); j++) {
                if(!sr.contains(String.valueOf(s.charAt(j)))){
                    sr+=s.charAt(j);
                }
                else{
                    break;
                }
            }
            System.out.println(sr);
            if(sr.length()>len){
                len=sr.length();
            }
        }
        System.out.println(len);
    }
}
