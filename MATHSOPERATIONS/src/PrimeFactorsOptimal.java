import java.util.ArrayList;
import java.util.Arrays;

public class PrimeFactorsOptimal {
    public static void main(String[] args) {
        int a=780;
        ArrayList<Integer> aa=new ArrayList<>();
        for(int i=2;i*i<=a;i++){
            if(a%i==0){
                aa.add(i);
                while(a%i==0){
                    a=a/i;
                }
            }
        }
        if(a!=1){
            aa.add(a);
        }
        System.out.println(aa);
    }
}
