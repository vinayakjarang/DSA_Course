import java.util.ArrayList;

public class CountPrimeInARANGE {
    public static void main(String[] args) {
        int aa=10;
        int n=40;

        boolean[] a=new boolean[n];
        //Arrays.fill(a,true);
//        System.out.println(Arrays.toString(a));
        int aac=0;
        int count=0;
        for(int i=2;i<n;i++){
            if(!a[i]){
                if(i<aa){
                    aac++;
                }
                count++;
                for (int j=2*i;j<n;j=j+i){
                    a[j]=true;
                }
            }
        }
        System.out.println(aac);
        System.out.println(count);
        System.out.println(count-aac);
    }
}
