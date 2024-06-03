public class Paranthesis {
    public static void main(String[] args) {
        String s="(()())(())(()(()))";
        String finl="";
        String result="";
        int count=0;
        int low=0;
        while(low<s.length()){
            char ch=s.charAt(low);
            if(ch=='('){
                count++;
                finl+=ch;
            }
            else if(ch==')'){
                count--;
                finl+=ch;
            }
            if(count==0){
                for(int i=1;i<finl.length()-1;i++){
                    result+=finl.charAt(i);
                }
                finl="";
            }
            low++;
        }
        System.out.println(result);
    }
}
