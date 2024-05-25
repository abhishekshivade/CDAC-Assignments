class DLL {
    Node head;

    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            prev = next = null;
        }
    }

    void insert(int newData) {
        if (head == null) {
            head = new Node(newData);
            return;
        }

        Node node = head;

        while (node.next != null) {
            node = node.next;
        }

        Node newNode = new Node(newData);
        node.next = newNode;
        newNode.prev = node;

    }

    void print() {
        if (head == null)
            return;

        Node node = head;

        while (node != null) {
            System.out.print(node.data + "--->");
            node = node.next;
        }
        System.out.println();
    }

    void reverse() {
        if (head == null)
            return;

        Node node = head;

        while (node.next != null) {
            node = node.next;
        }

        while (node != null) {
            System.out.print("<---" + node.data);
            node = node.prev;
        }
        System.out.println();
    }

    void delete(int key) {
        if (head == null || head.data == key) {
            System.out.println("empty list");
            return;
        }

        Node node = head;

        while (node != null) {

            if (node.data == key) {
                node.prev.next = node.next;
                return;
            }

            node = node.next;
        }
    }

    void count() {
        int n = 0;
        if (head == null) {
            System.out.println(n);
            return;
        }

        Node node = head;

        while (node != null) {
            n++;
            node = node.next;
        }

        System.out.println("Count : " + n);
    }

    void max() {
        if (head == null) {
            System.out.println("empty list");
            return;
        }

        Node node = head;
        Node max = head;

        while (node != null) {
            if (max.data < node.data) {
                max = node;
            }

            node = node.next;
        }

        System.out.println("Max : " + max.data);
    }

    void sort() {
        if (head == null)
            return;

        Node node = head;

        while (node != null) {
            Node node1 = node.next;

            while (node1 != null) {
                if (node.data > node1.data) {
                    int temp = node1.data;
                    node1.data = node.data;
                    node.data = temp;
                }

                node1 = node1.next;
            }

            node = node.next;
        }
    }

    void insertAfter(int newdata) {
        if (head == null)
            return;

        Node node = head;
        Node prevNode = null;

        while (node != null && node.data < newdata) {
            prevNode = node;
            node = node.next;
        }

        Node newNode = new Node(newdata);

        newNode.next = prevNode.next;
        newNode.prev = prevNode.prev;
        prevNode.next = newNode;
        newNode.prev = prevNode;
    }
}

class SolutionDLL {
    public static void main(String[] args) {
        DLL dll = new DLL();

        dll.insert(12);
        dll.insert(13);
        dll.insert(10);
        dll.insert(1);
        dll.insert(2);
        dll.insert(15);

        dll.print();
        dll.reverse();
        dll.delete(10);
        dll.print();
        dll.count();
        dll.max();
        dll.sort();
        dll.print();
        dll.insertAfter(10);
        dll.print();
    }
}