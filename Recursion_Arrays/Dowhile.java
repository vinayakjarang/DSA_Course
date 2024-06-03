import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int p=s.nextInt();
        do{
            System.out.println(p+" ");
            p++;
        }while(p<20);
    }
}
