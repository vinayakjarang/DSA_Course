import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list1=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list1.add(new ArrayList<>());
        }
        System.out.println(list1);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list1.get(i).add(s.nextInt());
            }
        }
        System.out.println(list1);
    }
}
