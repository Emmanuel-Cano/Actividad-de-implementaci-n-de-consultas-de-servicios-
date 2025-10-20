public class App {
    public static void main(String[] args) throws Exception {

        SinglyLinkedList lista = new SinglyLinkedList();
        lista.printList();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(5);
        lista.add(1);
        lista.add(1);
        lista.add(8);
        lista.add(5);
        lista.add(5);
        lista.add(5);
        System.out.println("Lista original:");
        lista.printList();
        lista.remove(5);
        System.out.println("==============");
        System.out.println("Lista despues de eliminara duplicados: ");
        lista.removeDuplicates();
        lista.printList();
    }
}
