class AA{
    void display1(){
        System.out.println("A class");
    }
}
class BA extends AA{
    void display2(){
        System.out.println("B class");
    }
}
class CR extends AA{
    void display3(){
        System.out.println("C class");
    }
}
public class InheritanceHIERARCHIAL {
    public static void main(String[] args) {
        CR cc=new CR();
        cc.display1();
        cc.display3();
//        cc.display2();
    }
}
