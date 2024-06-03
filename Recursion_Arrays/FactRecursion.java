public class FactRecursion {
    public static void main(String[] args) {
        System.out.println(fact(2012)%1000000000+7);
    }
    static long fact(long n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
