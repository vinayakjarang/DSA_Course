import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner s=new Scanner((System.in));
        int[] a={1,2,3};
        int[] b=a;
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(a));

////        String[] p=new String[2];
//////        System.out.println(a[4]);
////        System.out.println(p[0]);
//        for(int i=0;i<a.length;i++){
//            a[i]=s.nextInt();
//        }
//
//        for(int i=0;i<a.length;i++){
//            System.out.print(a[i]+" ");
//        }
//        for(int j:a){
//            System.out.print(j+" ");
//        }
//        System.out.print(Arrays.toString(a));


    }
}