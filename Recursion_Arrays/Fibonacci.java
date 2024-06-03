import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int f=s.nextInt();
        int a=0,b=1,count=2;
        while(count<=f){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);
    }
}
