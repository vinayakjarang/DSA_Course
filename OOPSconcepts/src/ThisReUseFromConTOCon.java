public class ThisReUseFromConTOCon {
    int id;
    String name;
    float f;
    boolean b;
    ThisReUseFromConTOCon(int id,String name){
        this.id=id;
        this.name=name;

    }
    ThisReUseFromConTOCon(int id,String name,float f,boolean b){
        this(id,name);
        this.f=f;
        this.b=b;
    }
    void display(){
        System.out.println(id+" "+name+" "+f+" "+b);
    }

    public static void main(String[] args) {
        ThisReUseFromConTOCon ht=new ThisReUseFromConTOCon(24,"vinn");
        ThisReUseFromConTOCon ht1=new ThisReUseFromConTOCon(24,"vinn",5.6f,true);
        ht.display();
        ht1.display();

    }
}
