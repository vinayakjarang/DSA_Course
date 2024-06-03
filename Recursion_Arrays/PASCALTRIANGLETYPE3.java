import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PASCALTRIANGLETYPE3 {
    public static void main(String[] args) {//print all elements of PT by giving size
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<List<Integer>> lis=new ArrayList<>();

        for (int j = 1; j <=n; j++) {
            List<Integer> temp=new ArrayList<>();
            int ans = 1;
            temp.add(ans);
            for (int i = 1; i < j; i++) {
                ans = ans * (j - i);
                ans = ans / i;
                temp.add(ans);
            }
            lis.add(temp);
        }
        for (List<Integer> k:lis){
            for(Integer arr:k){
                System.out.print(arr+" ");
            }
            System.out.println();
        }
    }
}
