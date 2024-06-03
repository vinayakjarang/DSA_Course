public class ThisCurrentClass_InstanceVar {
    int id;
    String name;
    ThisCurrentClass_InstanceVar(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        ThisCurrentClass_InstanceVar th=new ThisCurrentClass_InstanceVar(987,"ggusa");
        th.display();
    }
}
