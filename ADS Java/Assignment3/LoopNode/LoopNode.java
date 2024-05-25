package LoopNode;

public class LoopNode {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }

    void display(){
        if(head==null) return;

        Node n=head;

        while (n!=null) {
            System.out.print(n.data+"----->");
            n=n.next;
        }
    }

    void add(int data){
        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        Node n=head;

        while(n.next!=null){
            n=n.next;
        }

        n.next=newNode;
    }

    void loop(){
        if(head==null) return;

        Node n=head;
        while(n.next!=null){
            n=n.next;
        }

        n.next=head;
    }

    boolean isLoop(){
        if(head==null) return false;

        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(fast==slow){
                System.out.println(fast.data);
                return true;
            }
        }

        return false;
    }
}

class SolutionLoopNode{
    public static void main(String[] args) {
        LoopNode l=new LoopNode();

        l.add(10);
        l.add(14);
        l.add(6);
        l.add(11);
        l.add(5);

        l.display();
        System.out.println();

        // l.loop();

        if(l.isLoop()) System.out.println("is loop");
        else System.out.println("not loop");

        
    }
}
