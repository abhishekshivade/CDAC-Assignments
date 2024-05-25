package Sum;

public class Sum {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }

   static void display(Node node){
        if(node==null) return;

        while(node!=null){
            System.out.print(node.data+"---->");
            node=node.next;
        }
    }

    void insert(int newData){

        Node newNode=new Node(newData);

        if(head==null){
            head=newNode;
            return;
        }

        Node node=head;

        while(node.next!=null){
            node=node.next;
        }

        node.next=newNode;
    }

    static Node reverse(Node head){
        if(head==null) return null;

        Node prev=null;
        Node curr=head;
        Node next=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }

   static Node add(Node n1,Node n2){
        
        Node rl1=reverse(n1);
        Node rl2=reverse(n2);

        Node resultHead=null;
        Node curr=null;
        int carry=0;

        while(rl1!=null || rl2!=null){

            int val1=(rl1!=null)? rl1.data:0;
            int val2=(rl2!=null)? rl2.data:0;

            int sum = val1+val2+carry;
            carry=sum/10;
            int digit=sum%10;

            Node newNode=new Node(digit);

            if(resultHead==null){
                resultHead=newNode;
                curr=resultHead;
            }else{
                curr.next=newNode;
                curr=curr.next;
            }

            if (rl1!=null) rl1=rl1.next;
            if (rl2!=null) rl2=rl2.next;
        }

        if(carry>0) curr.next=new Node(carry);

        return reverse(resultHead);
    }
}

class SolutionSum{
    public static void main(String[] args) {
        Sum l1=new Sum();
        l1.insert(1);
        l1.insert(2);
        l1.insert(3);

        Sum.display(l1.head);
        System.out.println();

        Sum l2=new Sum();
        l2.insert(4);
        l2.insert(5);
        l2.insert(6);

        Sum.display(l2.head);
        System.out.println();

        Sum.Node node = Sum.add(l1.head, l2.head);

        Sum.display(node);
    }
}
