public class CopyConstructorUsingConstructor {
    int id;
    String name;
    CopyConstructorUsingConstructor(int i,String s){
        id=i;
        name=s;
    }
    CopyConstructorUsingConstructor(CopyConstructorUsingConstructor c1){
        id=c1.id;
        name=c1.name;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        CopyConstructorUsingConstructor c1=new CopyConstructorUsingConstructor(10,"vinnu");
        CopyConstructorUsingConstructor c2=new CopyConstructorUsingConstructor(c1);
        c1.display();
        c2.display();
    }
}
