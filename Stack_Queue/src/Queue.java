import java.util.*;

public class Queue {
    int front,rear,cnt,n;
    int [] arr;
    Queue(){
        arr=new int[10];
        n=10;
        cnt=0;
        front=-1;
        rear=-1;
    }
    Queue(int n){
        this.n=n;
        arr=new int[n];
        front=-1;
        rear=-1;
        cnt=0;
    }
    void push(int x){
        if(cnt==n){
            System.out.println("Queue is full");
            return;
        }
        if(rear==-1){
            front=0;
            rear=0;
        }
        else{
            rear=(rear+1)%n;
        }
        arr[rear]=x;
        System.out.println("pushed element is:-> "+x);
        cnt++;
    }
    void pop(){
        if(front==-1){
            System.out.println("queu is empty");
            return;
        }
        int poped=arr[front];
        if(cnt==1){
            front=-1;
            rear=-1;
        }
        else{
            front=(front+1)%n;
        }
        cnt--;
        System.out.println("poped :-> "+poped);

    }
    void top(){
        if(rear==-1){
            System.out.println("queue is empty");
            return;
        }
        System.out.println("top element-> "+arr[front]);
    }
    void print(){
        System.out.print("Queue is:- ");
        int ref=cnt;
        if(front<=5){
            for (int i = front; i < n; i++) {
                System.out.print(arr[i]+" ");
                ref--;
            }
        }
        for(int i=(rear-front)%n;i<ref;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.push(10);
        q.push(11);
        q.push(12);
        q.push(13);
        q.push(14);
        q.push(15);
        q.push(16);
        q.push(17);
        q.push(18);
        q.push(19);
        q.push(20);
        System.out.println("vinyak");
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.push(52);
        q.push(53);
        q.push(54);
        q.push(56);
        q.pop();
        q.pop();
        q.pop();
        q.top();
//        Queue<Integer> q=new LinkedList<Integer>();
//        Queue < Integer > q = new LinkedList < > ();
//        System.out.println(q.cnt);
//        q.print();
//        q.pop();
//        q.print();
//        q.pop();
//        q.print();
//        q.pop();
//        q.print();
//        q.pop();
//        q.print();
//        q.push(1234);
//        q.push(431);
//        q.print();


    }

}
