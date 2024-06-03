public class DoubleLL {
    private LNode head;
    class LNode{
        int data;
        LNode next;
        LNode prev;
        LNode(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public void print(){
        LNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+" <--> ");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void printr(){
        LNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp!=null){
            System.out.print(temp.data+" <--> ");
            temp=temp.prev;
        }
        System.out.print("null");
        System.out.println();
    }
    public void adddlst(int data){
        LNode newnode=new LNode(data);
        if(head==null){
            head=newnode;
            return;
        }
        LNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        newnode.prev=temp;
        temp.next=newnode;
    }
    public void addfrst(int data){
        LNode newnode = new LNode(data);
        if(head == null){
            head=newnode;
            return ;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }

    public static void main(String[] args) {
        DoubleLL dd=new DoubleLL();
        dd.adddlst(10);
        dd.adddlst(101);
        dd.adddlst(102);
        dd.adddlst(103);
        dd.adddlst(104);
        dd.addfrst(1);
        dd.print();
//        dd.print();
        dd.printr();
    }


}
