import java.util.Scanner;

public class CountingOccurances {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the NUmber:");//12548963275
        int k=s.nextInt();
        System.out.println("enter the nmer to count:");
        int p=s.nextInt();
        int count=0;
        while(k>0){
            int temp=k%10;
            if(temp==p){
                count++;
            }
            k=k/10;
        }
        System.out.println(count);
    }
}
