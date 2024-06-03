class Animal{
    void eat(){System.out.println("animal is eating...");}
}
class Dog extends Animal{
    void eat1(){System.out.println("dog is eating...");}
}
class TryForOutputRTP extends Dog{
    public static void main(String args[]){
        Animal a=new TryForOutputRTP();
        a.eat();
    }}  