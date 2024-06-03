import java.util.Arrays;

public class SieveofERATOSTHENES {
    public static void main(String[] args) {
        int a=30;
        int[] arr=new int[31];
        for (int i = 2; i < arr.length; i++) {
            arr[i] = 1;
        }
        for(int i=2;i<=a;i++){
            for(int j=i*i;j<=a;j=j+i){
                arr[j]=0;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                System.out.print(i+" ");
            }
        }
    }
}
