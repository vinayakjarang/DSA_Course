import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun("vinayak", "jarang","narsimha","maya","swapna");
    }

    private static void fun(String ...a) {
        System.out.println(Arrays.toString(a));
        System.out.println(a[2]);

    }
}
