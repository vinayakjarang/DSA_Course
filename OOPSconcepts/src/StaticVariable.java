public class StaticVariable {
    int a;
    String  name;
    static String clg="cmrcet";
    StaticVariable(int x,String y){
        a=x;
        name=y;
    }
    void print(){
        System.out.println(name+" "+a+" "+clg);
    }

    public static void main(String[] args) {
        StaticVariable s=new StaticVariable(40,"vinnu");
        s.print();
    }
}
