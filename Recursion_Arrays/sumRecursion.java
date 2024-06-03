public class sumRecursion {
    public static void main(String[] args) {
        sum(3,0);
        int m=sum1(4);
        System.out.println(m);
    }
    static int sum1(int n){
        if(n==0){
            return 0;
        }
        return n+sum1(n-1);
    }
    static void sum(int n,int sum){
        if(n<1){
            System.out.println(sum);
            return ;
        }
        sum(n-1,sum+n);
    }
}
