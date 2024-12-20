class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class linkedList<T> {
    private Node<T> head;

    public linkedList() {
        this.head = null;
    }

    public void add(T data) {
        Node<T> temp = new Node<>(data);
        if (head == null) {
            head = temp;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = temp;
        }
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

class linkedListMain {
    public static void main(String[] args) {
        linkedList<Integer> intList = new linkedList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        System.out.println("Integer Linked List:");
        intList.display();

        linkedList<Double> doubleList = new linkedList<>();
        doubleList.add(1.8);
        doubleList.add(15.9);
        doubleList.add(14.2);

        System.out.println("\nDouble Linked List:");
        doubleList.display();
    }
}