import java.util.Arrays;

public class ReplaceSpaces {
    public static void main(String[] args) {
        String s="";
        StringBuilder ss=new StringBuilder("vinayak is this");
        s=ss.toString();
        ss.delete(0,ss.length());
        s=s.replace(" ","@40");
        System.out.println(ss.append(s));

    }
}
