import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
//        int[][] a=new int[3][3];
//        int[][] b={
//                {1,2,3},{4,5,6},{7,8,9}
//        };
//        for (int i=0;i<b.length;i++){
//            System.out.println(Arrays.toString(b[i]));
//        }
        int[][] b=new int[3][3];
        for (int i = 0; i <b.length ; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j]=m.nextInt();
            }
        }
//        for (int i = 0; i <b.length ; i++) {
//            for (int j = 0; j < b[i].length; j++) {
//                System.out.print(b[i][j]+" ");
//            }
//            System.out.println();
//        }
        for(int[] i:b){
            System.out.println(Arrays.toString(i));
        }


    }
}
