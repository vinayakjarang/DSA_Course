class Student{
    int id;
    String name;
}
public class MainOutsideTheClass {
    public static void main(String[] args) {
        Student s=new Student();
        System.out.println(s.id+" "+s.name);
    }
}
