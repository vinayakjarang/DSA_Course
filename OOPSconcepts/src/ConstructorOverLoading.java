public class ConstructorOverLoading {
    int a;
    int b;
    int c;
    ConstructorOverLoading(int a,int b){
        System.out.println(a+b);
    }
    ConstructorOverLoading(int a,int b, int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        ConstructorOverLoading co=new ConstructorOverLoading(10,20);
        ConstructorOverLoading co1=new ConstructorOverLoading(10,20,30);

    }
}
