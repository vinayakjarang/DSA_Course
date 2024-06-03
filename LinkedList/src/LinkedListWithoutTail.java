import java.util.ArrayList;
import java.util.jar.JarOutputStream;

public class LinkedListWithoutTail {
    private Node head;
//    public Node tail;
    private int size;
    LinkedListWithoutTail(){
        this.size=0;
    }
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
            size++;
        }
    }
    // add first or add last
    //add first
    public void AddFrst(int val){
        Node newnode=new Node(val);
        if(head == null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void AddLast(int val){
        Node newNode = new Node(val);
        if (head==null){
            head=newNode;
            return ;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    public void printlist(){
        if (head==null){
            System.out.println("list is empty-");
            return ;
        }
        Node current=head;
        while(current!=null){
            System.out.print(current.val+" --> ");
            current=current.next;
        }
//        System.out.print(current.val+" --> ");
        System.out.print("NULL");
    }
    //delete frst and delete last
    public void delfrst(){
        if(head==null){
            System.out.println("empty list");
            return ;
        }
        size--;
        System.out.println("deleted node-->"+head.val);
        head=head.next;
    }
    public void dellast(){
        if(head==null){
            System.out.println("empty list");
            return ;
        }
        size--;
        if(head.next==null){
            System.out.println("deleted node--> "+head.val);
            head=null;
        }
        Node current=head;
        while(current.next.next!=null){
            current=current.next;
        }
        System.out.println("deleted node--> "+current.next.val);
        current.next=null;
    }
    public int getsize(){
        return size;
    }
    public void reverse(){
        if(head==null || head.next==null){
            return;
        }

        Node prev=head;
        Node current=head.next;

            while(current!=null) {
                Node after=current.next;
                current.next=prev;
                prev=current;
                current=after;
            }
        head.next=null;
        head=prev;

    }
    public Node reverseRec(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead=reverseRec(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    //// SIZE - N + 1 FROM LAST
    public void FindNthromlast(int find){
        int len=size;
        if(head==null || find>len){
            System.out.println("not find");
            return;
        }
        Node temp=head;
        if(find==size){
            System.out.println(temp.val);
            head=head.next;
            temp.next=null;
            return;
        }
        Node prev=null;
        while(len-find!=0){
            prev=temp;
            temp=temp.next;
            len--;
        }
        System.out.println(temp.val);
        prev.next=temp.next;
        temp.next=null;
//        return temp.val;
    }
    public void rev(){
        Node temp=head;
        for(int i=0;i<size/2;i++){
            temp=temp.next;
        }
        
    }

    //Odd Even Linked List
//    public void oddeven(){
//        int len=1;
//        Node curr=head;
//        Node temp=head;
//        while(temp.next!=null){
//            if(len%2==1){
//                temp=temp.next;
//
//            }
//            else{
//                Node nextc=temp.next;
//                Node nextc2=nextc.next;
//                nextc.next=curr.next;
//                curr.next=nextc;
//                temp.next=nextc2;
//                curr=curr.next;
//                temp=temp.next;
//
//            }
//            len++;
//
//        }
//        System.out.println(temp.val);
//        System.out.println(curr.val);
//    }
    public Node reverseqq(Node temp){
        if(temp==null || temp.next==null){
            return temp;
        }

        Node prev=temp;
        Node current=temp.next;

        while(current!=null) {
            Node after=current.next;
            current.next=prev;
            prev=current;
            current=after;
        }
        temp.next=null;
        temp=prev;
        return temp;
    }




    public static void main(String[] args) {
        LinkedListWithoutTail ll=new LinkedListWithoutTail();
        ll.AddFrst(10);
        ll.AddLast(210);
        ll.AddLast(320);
        ll.AddLast(4220);
        ll.AddLast(50);
        ll.AddLast(50);
        ll.AddLast(420);
        ll.AddLast(130);
        ll.AddLast(220);
        ll.AddLast(10);
        ll.printlist();
        Node slow=ll.head;
        Node fast=ll.head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temphead=slow.next;
        slow.next=null;

        ll.reverseqq(temphead);
        System.out.println();
        ll.printlist();
//        ll.delfrst();
//        ll.printlist();
//        ll.dellast();
//        ll.printlist();
//        System.out.println();
//        System.out.println(ll.getsize());
//        ll.printlist();
//        ll.AddLast(100);
//        System.out.println();
//        ll.printlist();
//        System.out.println();
//        System.out.println(ll.getsize());
//
//        System.out.println("------> ans is ");
//        ll.oddeven();
//        System.out.println();
//        ll.printlist();
//        if(ll.printlist().ll.reverse()==ll.printlist()){

//        }
//        ll.head=ll.reverseRec(ll.head);
//        System.out.println();
//        ll.printlist();
//        System.out.println(ll.size);
//        System.out.println();
//        ll.FindNthromlast(1);

//
//        System.out.println();
//        ll.printlist();
    }

}
