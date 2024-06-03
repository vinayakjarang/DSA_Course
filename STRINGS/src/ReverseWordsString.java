import java.util.Arrays;

public class ReverseWordsString {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        String str="this is vinayak    jarang    ";
        String ss=str.trim();
        String[] strarr=str.split(" ");
        System.out.println(Arrays.toString(strarr));
        for (int i=strarr.length-1;i>=0;i--) {
            String bd=strarr[i].trim();
            if(bd.equals("")){
                continue;
            }
            else if (i==0){
                sb.append(bd);
//                sb.append();
            }
            else{
                sb.append(bd+" ");
//                sb.append();
            }
        }
        System.out.println(sb.toString());

        String s="this is vinayak    jarang    ";
        String[] arr = s.trim().replaceAll(" +", " ").split(" ");
        System.out.println(Arrays.toString(arr));
    }
}
