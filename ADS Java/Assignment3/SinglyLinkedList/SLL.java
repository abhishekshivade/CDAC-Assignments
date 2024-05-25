package SinglyLinkedList;
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
            System.out.print(n.data+"---->");
            n=n.next;
        }
    }

    void insert(int newData){
        Node newNode=new Node(newData);
        newNode.next=head;
        head=newNode;
    }
}

class SolutionSl{
    public static void main(String[] args) {
        SLL sl=new SLL();
        sl.head=new SLL.Node(10);
        sl.insert(5);
        sl.insert(8);
        sl.insert(1);

        sl.display();
        
    }
}