import java.util.Arrays;
//range
public class SieveofERATOSTHENESBOOLEAN {
    public static void main(String[] args) {
        int n=40;
        boolean[] a=new boolean[n];
        //Arrays.fill(a,true);
//        System.out.println(Arrays.toString(a));
        int count=0;
        for(int i=2;i<n;i++){
            if(!a[i] ){
                count++;
                for (int j=2*i;j<n;j=j+i){
                    a[j]=true;
                }
            }
        }
        System.out.println(count);


    }
}
