class Std{
    int id;
    String name;
    int sal;
    void insert(int a,String b,int c){
        id=a;
        name=b;
        sal=c;
    }
    void print(){
        System.out.println(id+" "+name+" "+sal);
    }
}
public class Creatingmultipleobjects {
    public static void main(String[] args) {
        Std s1=new Std(),s2=new Std(),s3=new Std();
        s1.insert(10,"vin",100000);
        s2.insert(103,"645654vin",100565000);
        s3.insert(140,"vinwfqw",18856000);
        s1.print();
        s2.print();
        s3.print();
    }
}
