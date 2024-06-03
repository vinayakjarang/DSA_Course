import java.util.ArrayList;
import java.util.List;

public class FindDuplicate_Missing {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        long n=a.length;
        long sn=(n*(n+1))/2;
        long s2n=(n*(n+1)*(2*n+1))/6;
        long s=0;
        long s2=0;
        for (int i=0;i<a.length;i++){
            s+=a[i];
            s2+=a[i]*a[i];
        }
        long val1=s-sn;
        long val2=s2-s2n;
        long x=(val2/val1+val2)/2;
        long y=x-val1;
        System.out.println(y+" "+x);















//        ArrayList<Integer> ar=new ArrayList<Integer>();
//        List<Integer> A=new ArrayList<Integer>();
//        A.add(3);
//        A.add(1);
//        A.add(2);
//        A.add(5);
//        A.add(3);
//
//        int sl=A.get(0);
//        int fst=A.get(0);
//        do{
//            sl=A.get(sl);
//            fst=A.get(A.get(fst));
//        }while(sl!=fst);
//        fst=A.get(0);
//        while(fst!=sl){
//            fst=A.get(fst);
//            sl=A.get(sl);
//        }
//        ar.add(sl);
//        for(int i=1;i<=A.size();i++){
//            if(!A.contains(i)){
//                ar.add(i);
//            }
//        }
//
//        System.out.println(ar);
    }
}
