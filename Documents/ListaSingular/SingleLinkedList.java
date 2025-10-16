

public class SingleLinkedList{

    Node head;

    public void add(int data){
        Node newNode = new Node(data); //Creacion de nuevo nodo

        if(head == null){ //Verificacion de lista vacia
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null){ //Recorriddo de los nodos
            current = current.next;
        }
        current.next = newNode; //Insertar nuevo nodo
    }

    public boolean contains(int data){

        Node current =head;
        while(current != null){
            if(current.data == data){
                return true;
            }
            current = current.next;
        }
        

        return false;
    }

    public void remove(int data){
        if(head==null){ //Pregunta si la lista esta vacia
            return;
        }
        if(head.data == data){ //Valida que el dato este en el head
            head = head.next; //Elimina el primer nodo
            return;
        }
        Node current = head;
        while(current.next != null && current.next.data != data){ //Recorrer hasta encontrar el valor
            current = current.next;

        }
        current.next = current.next.next; //Asignamos el nodo corriente al siguiete
    }
    public void prinList(){

        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current=current.next;
        }
        System.out.println("null");

    }

    public int conta(int data){
        int contador = 0;
        Node current = head;

        while(current!= null){
            if(current.data == data){
                contador ++;
            }
            current = current.next;
        }
        return  contador;

    }


}