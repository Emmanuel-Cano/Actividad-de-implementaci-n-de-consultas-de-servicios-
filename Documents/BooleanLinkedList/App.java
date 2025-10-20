public class App {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        System.out.println("Lista antes de agregar elementos:");
        list.printForward();

        list.add(1);
        list.add(2);
        list.add(5);
        list.add(6);

        System.out.println("Lista:");
        list.printForward();

        System.out.println("\n------Imprimir backward------");
        list.printBackward();

        System.out.println("\n------Eliminar elemento 5------");
        list.remove(5);
        list.printForward();

        System.out.println("\n------Eliminar elemento 1 (head)------");
        list.remove(1);
        list.printForward();

        System.out.println("\n------Eliminar elemento 6 (tail)------");
        list.remove(6);
        list.printForward();
    }
}
