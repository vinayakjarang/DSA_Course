import java.util.Scanner;

public class PASCALTRIANGLETYPE1{//print an element of a given n and row
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r=s.nextInt();
        System.out.println(ncr(n-1,r-1));
    }
    static int ncr(int n,int r){
        int ans=1;
        for(int  i=0;i<r;i++){
            ans=ans*(n-i);
            ans=ans/(i+1);
        }
        return ans;
    }
}

