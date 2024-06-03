class A{
    void display1(){
        System.out.println("A class");
    }
}
class B extends A{
    void display2(){
        System.out.println("B class");
    }
}
class c extends B{
    void display3(){
        System.out.println("C class");
    }
}

public class InheritanceMULTILEVEL {
    public static void main(String[] args) {
        c cr=new c();
        cr.display1();
        cr.display2();
        cr.display3();
    }
}
