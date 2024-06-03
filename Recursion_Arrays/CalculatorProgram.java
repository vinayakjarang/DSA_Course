import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true){
            char ch=s.next().trim().charAt(0);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%'){
                int a=s.nextInt();
                int b=s.nextInt();
                if (ch == '+') {System.out.println(a+b);}
                else if(ch=='-'){System.out.println(a-b);}
                else if(ch=='*'){System.out.println(a*b);}
                else if(ch=='/'){
                    if(b>=0){
                        System.out.println(a/b);
                    }
                }
                else{System.out.println(a%b);}
            }else if(ch=='x' || ch=='X'){
                break;
            }
            else{
                System.out.println("enter valid char");
            }
        }
    }
}
