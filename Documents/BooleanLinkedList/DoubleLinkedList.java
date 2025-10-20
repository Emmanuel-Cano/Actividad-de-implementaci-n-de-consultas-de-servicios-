public class DoubleLinkedList {

    Node head;
    Node tail;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public void printForward() {
        Node current = head;
        if (current == null) {
            System.out.println("(Lista vacía)");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void printBackward() {
        Node current = tail;
        if (current == null) {
            System.out.println("(Lista vacía)");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println("null");
    }

    public void remove(int data) {
        if (head == null) {
            System.out.println("La lista está vacía, no se puede eliminar.");
            return;
        }

        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Valor " + data + " no encontrado.");
            return;
        }

        if (current == head) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
            return;
        }

        if (current == tail) {
            tail = tail.prev;
            tail.next = null;
            return;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
    }
}
