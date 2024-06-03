import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int p=s.nextInt();
        while(p<20){
            System.out.print(p+" ");
            p++;
        }
    }
}
