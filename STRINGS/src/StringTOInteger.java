public class StringTOInteger {
    public static void main(String[] args) {
        String s="-14785";
        s=s.trim();
        String res="";
        int k=0;
        if(s.charAt(k)=='-' || s.charAt(k)=='+'){
            res+=s.charAt(k);
            k=1;
            if(s.charAt(k+1)=='0'){
                k=2;
            }
        }
        System.out.println(res);
        for(int i=k;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                res+=ch;
            }
            else{
                break;
            }
        }
        System.out.println(String.valueOf(res));
    }
}
