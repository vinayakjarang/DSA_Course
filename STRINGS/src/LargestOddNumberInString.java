public class LargestOddNumberInString {
    public static void main(String[] args) {
        String s="4506";
//        String g="";
//        int i=Integer.parseInt(s);
//        while(i>=0){
//            if(i%2!=0){
//                g=String .valueOf(i);
//                break;
//            }
//            i=i/10;
//        }
//        System.out.println(g);

        //optimal using substring
        for (int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch%2!=0){
                System.out.println(s.substring(0,i+1));
                break;
            }
        }
    }
}
