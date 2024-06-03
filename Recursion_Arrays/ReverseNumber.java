import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String m=s.next();
//        String o=m[0];
        System.out.println("enter the NUmber:");//1254
        int k=s.nextInt();
        int result=0;
        while(k>0){
            int temp=k%10;//5
            result=result*10+temp;//40
            k=k/10;//125
        }
        System.out.println(result);
    }
}
