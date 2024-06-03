class Student2{
    int id;
    String name;
    void input(int i,String n){
        id=i;
        name=n;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}
public class WAY2toInitilizeObjectMethod {
    public static void main(String[] args) {
        Student2 s11=new Student2();
        Student2 s12=new Student2();
        s11.input(10,"vinayak");
        s12.input(102,"vin345ayak");
        s11.display();
        s12.display();
    }
}
