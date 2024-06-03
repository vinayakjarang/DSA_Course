public class ThistoInvokeCurrentClsMthod {
    int id;
    String  name;
    void A() {
        System.out.println("vinayak");
    }
    void B() {
        System.out.println("jarang");
        A(); //by default this keyword is added by the compiler
        this.A();
    }

    public static void main(String[] args) {
        ThistoInvokeCurrentClsMthod th=new ThistoInvokeCurrentClsMthod();
        th.B();
    }
}
