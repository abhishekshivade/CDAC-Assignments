package NthNode;

public class NthNode {
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

        while(n!=null){
            System.out.print(n.data+"----->");
            n=n.next;
        }
    }

    void add(int newData){
        
        Node newNode=new Node(newData);

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

    Node find(int n){
        if(head==null || n<=0){
            return null;
        }

        Node ptr1=head;
        Node ptr2=head;

        for(int i=0;i<n;i++){
            if(ptr1==null) return null;

            ptr1=ptr1.next;
        }

        while(ptr1!=null){
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }

        return ptr2;
    }
}

class SolutionN{
    public static void main(String[] args) {
        NthNode l = new NthNode();

        l.add(12);
        l.add(2);
        l.add(10);
        l.add(7);
        l.add(3);

        l.display();
        System.out.println();

        NthNode.Node node=l.find(2);

        if(node!=null) System.out.println(node.data);
        else System.out.println("no node");
    }
}
