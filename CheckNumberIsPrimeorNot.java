public class CheckNumberIsPrimeorNot {
    public static void main(String[] args) {
        int a=197;
        int count=0;
        for(int i=1;i*i<=a;i++){
            if(a%i==0){
                count++;

            }
        }
        if(count==1){
            System.out.println("prime");
        }
        else{
            System.out.println("nor a prime");
        }
    }
}
