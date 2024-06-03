import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        String s=new String(chars);
        StringBuilder sbb=new StringBuilder();
        System.out.println(chars);
        int low=0;
        int nxt=1;
        int count=0;
        while(nxt<=s.length()-1){
            if(s.charAt(low)==s.charAt(nxt)){
                count++;
                low++;
                nxt++;
            }
            else{
                sbb.append(s.charAt(low));
                if(count+1!=1){
                    sbb.append(count+1);
                }
                count=0;
                low++;
                nxt++;
            }
        }
        sbb.append(s.charAt(low));
        if(count+1!=1){
            sbb.append(count+1);
        }
        System.out.println(sbb.toString());
        System.out.println(sbb.length());
        chars = sbb.toString().toCharArray();
        System.out.println(Arrays.toString(chars));

    }
}
