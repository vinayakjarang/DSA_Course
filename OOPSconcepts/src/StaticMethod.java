public class StaticMethod {
    int a;
    String  name;
    static String clg="cmrcet";
    static void change(){
        clg="cbrit";
    }
    StaticMethod(int x,String y){
        a=x;
        name=y;
    }
    void print(){
        System.out.println(name+" "+a+" "+clg);
    }

    public static void main(String[] args) {
        StaticMethod.change();
        StaticMethod s=new StaticMethod(40,"vinnu");
        s.print();
    }
}
