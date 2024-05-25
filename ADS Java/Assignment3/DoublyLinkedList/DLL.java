package DoublyLinkedList;
class DLL {

    Node head;

    static class Node {
        int data;
        Node next,prev;

        Node(int data){
            this.data=data;
            next=prev=null;
        }
    }

    void display(Node head){
        if(head==null) return;

        while(head!=null){
            System.out.print(head.data+"---->");
            head=head.next;
        }
    }

    void insert(int newData){
        Node newNode=new Node(newData);

        if(head==null) {
            head=newNode;
            return;
        }

        Node ptr=head;
        
        while(ptr.next!=null){
            ptr=ptr.next;
        }

        newNode.next=head;
        head=newNode;
    }
}

class SolutionDl{
    public static void main(String[] args) {
        DLL dl=new DLL();
        dl.head=new DLL.Node(10);

        dl.insert(15);
        dl.insert(5);
        dl.insert(12);

        dl.display(dl.head);
    }
}