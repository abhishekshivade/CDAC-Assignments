package Palindrome;

public class Palindrome {
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
        if (head == null)
            return;

        Node n = head;

        while (n != null) {
            System.out.print(n.data + "---->");
            n = n.next;
        }
    }

    void add(int newData) {

        Node newNode = new Node(newData);

        if (head == null) {
            head = newNode;
            return;
        }

        Node n = head;

        while (n.next != null) {
            n = n.next;
        }

        n.next = newNode;
    }

    Node reverse(Node node) {
        if (node == null)
            return null;

        Node prev = null;
        Node curr = node;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    boolean isPalindrome() {
        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = reverse(slow);

        Node p1 = head;
        Node p2 = mid;

        while (p2 != null) {
            if (p1.data != p2.data)
                return false;

            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }
}

class SolutionPalindrome {
    public static void main(String[] args) {
        Palindrome l=new Palindrome();

        l.add(13);
        l.add(2);
        l.add(5);
        l.add(5);
        l.add(2);
        l.add(13);

        l.display();
        System.out.println();

        if (l.isPalindrome()) System.out.println("is palindrome");
        else System.out.println("not palindrome");
    }
}