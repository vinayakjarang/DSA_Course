class Student1{
    int id;
    String name;
}

public class WAY1toInitilizeObjectReferenceVar {
    public static void main(String[] args) {
        Student1 s1=new Student1();
        Student1 s2=new Student1();
        s1.id=101;
        s1.name="vinayak";
        s2.id=512;
        s2.name="pappa";
        System.out.println(s1.id+" "+s1.name);
        System.out.println(s2.id+" "+s2.name);
    }
}
