package ReverseSLL;

class SLL {
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
        Node newNode=new SLL.Node(newData);

        newNode.next=head;
        head=newNode;
    }

    Node reverse(){
        Node curr=null;
        Node prev=null;

        while(curr.next!=null){
            curr=head;
            head=head.next;
            prev=curr;
            curr=curr.next;
            curr.next=prev;
        }

        return head;
    }
}

class SolutionSLL{
    public static void main(String[] args) {
        SLL sll=new SLL();
        sll.insert(10);
        sll.insert(5);
        sll.insert(15);
        sll.insert(8);

        sll.display();

        sll.reverse();
        sll.display();
    }
}