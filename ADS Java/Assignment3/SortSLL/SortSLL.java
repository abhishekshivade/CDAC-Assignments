package SortSLL;

public class SortSLL {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void display() {
        Node ptr=head;
        if (ptr == null)
            return;

        while (ptr != null) {
            System.out.print(ptr.data + "---->");
            ptr = ptr.next;
        }
        
        System.out.println();
    }

    void insert(int newData) {
        Node newNode = new Node(newData);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    Node merge(SortSLL l1,SortSLL l2){
        if(l1.head==null) return l2.head;
        else if(l2.head==null) return l1.head;
        else {
            Node n=l1.head;
            while (n.next!=null) {
                n=n.next;
            }

            n.next=l2.head;

            return head;
        }
    }

    void sort() {
        Node currNode = head;
        Node nextNode = null;
        int temp;
        boolean swapped;

        if (head == null || head.next == null) return;
        else {
            do {
                swapped = false;
                currNode = head;

                while (currNode.next != nextNode) {
                    if (currNode.data > currNode.next.data) {
                        temp = currNode.data;
                        currNode.data = currNode.next.data;
                        currNode.next.data = temp;
                        swapped = true;
                    }
                    currNode = currNode.next;
                }
                nextNode = currNode;
            } while (swapped);
        }
    }
}

class SolutionSortSLL {
    public static void main(String[] args) {
        SortSLL sll1 = new SortSLL();

        sll1.insert(10);
        sll1.insert(15);
        sll1.insert(5);
        sll1.insert(6);
        sll1.insert(4);

        sll1.display();

        sll1.sort();
        sll1.display();
        
        SortSLL sll2 = new SortSLL();

        sll2.insert(11);
        sll2.insert(14);
        sll2.insert(7);
        sll2.insert(12);
        sll2.insert(2);

        sll2.display();

        sll2.sort();
        sll2.display();

        sll1.merge(sll1, sll2);
        sll1.display();
        sll1.sort();
        sll1.display();
    }
}
