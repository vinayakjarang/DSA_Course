public class GCD_HCF {
    public static void main(String[] args) {
        System.out.println(gcd(52,10));
    }
    static int gcd(int a,int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if(a==b){return a;}
        while(a>0 && b>0){
            if(a>b){   //a!=b but now it is optimal
            a=a%b;    //a=a-b
            }
        else{
            b=b%a;   //b=b-a
        }
        }
        if(a==0){
            return b;
        }
        else{
            return a;
        }
    }
}
