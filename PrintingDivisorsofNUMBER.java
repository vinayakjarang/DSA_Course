public class PrintingDivisorsofNUMBER {
    public static void main(String[] args) {
        int a=36;
        for(int i=1;i*i<=a;i++){
            if(a%i==0){
                System.out.print(a/i+" ");
                if(a/i!=i){
                    System.out.print(i+" ");
                }

//                System.out.print();
            }
        }
    }
}
