public class App {

public static void main(String[] args)throws Exception {

    SingleLinkedList lista = new SingleLinkedList();
    
    lista.prinList();
    lista.add(1);
    lista.add(2);
    lista.add(3);
    lista.add(3);
    lista.add(3);
    lista.add(3);
    lista.add(5);

    System.out.println("--------------------------");
    lista.prinList();
    lista.remove(5);
    System.out.println("---------------------------");
    lista.prinList();

    int num = 3;
    System.out.println("El numero " + num + " esta "+ lista.conta(num));
    
}
    
}
