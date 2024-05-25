package Mid;

public class Mid {
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
        Node n=head;
        while(n!=null){
            System.out.print(n.data+"----->");
            n=n.next;
        }
    }

    void insert(int newData){
        Node newNode=new Node(newData);
        if(head==null) head=newNode;
        else{
            Node n=head;
            while(n.next!=null){
                n=n.next;
            }

            n.next=newNode;
        }
    }

    void mid(){
        // if(l==null) return;
        // else System.out.println(l.get(l.size()/2));

        if(head==null) return;
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        System.out.println(slow.data);
    }
}

class SolutionMid{
    public static void main(String[] args) {
        Mid m=new Mid();
        m.insert(15);
        m.insert(10);
        m.insert(12);
        m.insert(5);
        m.insert(8);
        m.insert(6);
        m.insert(4);
        // m.insert(9);

        m.display();
        System.out.println();
        m.mid();
    }
}
