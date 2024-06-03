public class PrintDivisorsofanumber {
    public static void main(String[] args) {

        int a=20;
        for(int i=1;i<=(int)Math.sqrt(a);i++){
            if(a%i==0){
                System.out.print(a/i+" ");
                System.out.print(i);
                System.out.println();
            }
        }
    }
}
