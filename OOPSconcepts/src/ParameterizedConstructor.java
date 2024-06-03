public class ParameterizedConstructor {
    int id;
    String name;
    ParameterizedConstructor(int a,String b){
        id=a;
        name=b;
    }
    void display() {
        System.out.println(id + " " + name);
    }
    public static void main(String[] args) {
        ParameterizedConstructor pc=new ParameterizedConstructor(10,"vinayak");
        pc.display();

    }
}
