public class MinimumAddtoMakeParenthesesValid {
    public static void main(String[] args) {
        String s = "())";
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                ans++;
            }
            else if(s.charAt(i)==')'){
                ans--;
            }
        }
        if(ans>0){
            System.out.println(ans);
        }
        else{
            System.out.println(ans*-1);
        }
    }
}
