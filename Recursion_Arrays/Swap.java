public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap(a,b);
        System.out.println("a="+a);
        System.out.println("b="+b);


    }
    static int swap(int c,int d){
        int temp=c;
        c=d;
        d=temp;
        return c;
    }
}
