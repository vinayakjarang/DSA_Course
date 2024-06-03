//import static java.lang.Math.random;

//public class RandomNumbers {//using Math.Random() method
//    public static void main(String[] args) {
//        int min=1000;
//        int max=9999;
//        int a=(int)(Math.random()*(max-min+1)+min);
//        System.out.println(a);
//    }
//}
import java.util.Random; // using Ramdom class from util package
public class RandomNumbers {
    public static void main(String[] args) {
        Random r=new Random();
        int a=r.nextInt(1000,9999);
        System.out.println(a);
    }
}
// ThreadLocalRandom.concurrent().nextInt();
// ints();

