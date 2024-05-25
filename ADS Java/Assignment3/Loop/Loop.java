class Loop {

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
        else {
            Node n = head;
            while (n != null) {
                System.out.print(n.data + "------>");
                n = n.next;
            }
        }
    }

    void add(int newData) {
        Node newNode = new Node(newData);

        if (head == null)
            head = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    boolean detectLoop() {
        Node slow = head;
        Node fast = head;

        if (head == null)
            return false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }

    void loop() {
        if (head == null)
            return;

        Node n = head;

        while (n.next != null) {
            n = n.next;
        }

        n.next = head;
    }
}

class SolutionLoop {
    public static void main(String[] args) {
        Loop l = new Loop();

        l.add(10);
        l.add(12);
        l.add(14);
        l.add(8);
        l.add(9);

        l.display();
        System.out.println();

        // l.loop();

        if (l.detectLoop())
            System.out.println("is loop");
        else
            System.out.println("not loop");
    }
}