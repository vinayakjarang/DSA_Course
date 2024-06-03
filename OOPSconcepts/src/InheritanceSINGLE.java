class me{
    void print(){
        System.out.println("B concentrated");
    }
}
class you extends me{
    void prin(){
        System.out.println("B success in ur life");
    }
}
public class InheritanceSINGLE {
    public static void main(String[] args) {
        you y=new you();
        y.print();
        y.prin();
    }
}
