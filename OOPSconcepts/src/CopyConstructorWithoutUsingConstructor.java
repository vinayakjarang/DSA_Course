public class CopyConstructorWithoutUsingConstructor {
    int id;
    String name;
    CopyConstructorWithoutUsingConstructor(int a, String n){
        id=a;
        name=n;
    }
    CopyConstructorWithoutUsingConstructor(){}
    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        CopyConstructorWithoutUsingConstructor c1=new CopyConstructorWithoutUsingConstructor(20,"vinnau");
        CopyConstructorWithoutUsingConstructor c2=new CopyConstructorWithoutUsingConstructor();
        c2.id=c1.id+1;
        c2.name=c1.name+"jarang";
        c1.display();
        c2.display();

    }
}
