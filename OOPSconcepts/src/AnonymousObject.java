public class AnonymousObject {
    void something(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        new AnonymousObject().something(77);
    }
}
