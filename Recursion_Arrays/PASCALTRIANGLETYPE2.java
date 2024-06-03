import java.util.Scanner;

public class PASCALTRIANGLETYPE2 {
    public static void main(String[] args) {//print total row elements
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
//        int r=s.nextInt();
        int ans=1;
        System.out.print(ans+" ");
        for (int i = 1; i < n; i++) {
            ans=ans*(n-i);
            ans=ans/i;
            System.out.print(ans+" ");
        }

    }

}
