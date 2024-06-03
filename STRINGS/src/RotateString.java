

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println((s+s));
        System.out.println((s+s).contains(goal));
        for(int i=0;i<s.length()-1;i++){
            s=rotatee(s,goal);
            System.out.println(s);
            if(s.equals(goal)){
                System.out.println("true");
                break;
            }
        }
    }

    static String rotatee(String s, String goal) {
        char ch=s.charAt(0);
        String r="";
        for(int i=0;i<s.length()-1;i++){
            r+=s.charAt(i+1);
        }
        r+=ch;
        return r;
    }
}
