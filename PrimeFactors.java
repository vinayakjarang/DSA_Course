import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

public class PrimeFactors {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int N=100;
        int n= (int) Math.sqrt(N);
        for(int i=2;i<=n;i++){
            if(N%i==0){
                arr.add(i);
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            int a= arr.get(i);
            for (int j = i+1; j < arr.size(); j++) {
                if(arr.get(j)%a==0){
                    arr.remove(j);
                }
            }
        }
        System.out.println(arr);
    }
}
