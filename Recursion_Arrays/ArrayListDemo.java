import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> lis=new ArrayList<Integer>(5);
//        lis.add(10);
//        lis.add(100);
//        lis.add(104);
//        lis.add(105);
//        lis.add(108);
//        lis.add(109);
//        lis.add(1,55);
//        lis.remove(2);
//        int b=lis.length;
//        lis.set(lis.length);
        for (int i = 0; i < 5; i++) {
            lis.add(s.nextInt());
        }
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(lis.get(2));
//        System.out.println(lis.subList(2,4));


    }
}
