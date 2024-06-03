import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String l=s.next();
        switch (l) {
            case "Grapes" -> System.out.println("its too small");
            case "Apple" -> System.out.println("its red in clr");
            case "Mango" -> System.out.println("its mango small");
            case "choco" -> System.out.println("its brown");
            default -> System.out.println("enter valid");
        }
    }
}
