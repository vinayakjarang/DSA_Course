import java.util.LinkedList;

public class LinkedListWithCollectionFramework {
    public static void main(String[] args) {
        LinkedList<Integer> lis=new LinkedList<>();
        lis.add(10);
        lis.addFirst(20);
        lis.addLast(30);
        lis.add(1,50);
        System.out.println(lis.contains(20));
        System.out.println(lis.element());
        System.out.println(lis.getFirst());
        System.out.println(lis.indexOf(30));
        System.out.println(lis.getLast());
        for (Integer i:lis) {
            System.out.print(i+" --> ");
        }
        System.out.print("NULL");
    }
}
