import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;


public class Cliente {

    int id;
    String name;
    Deque<String> docs;

    Cliente(int id, String name){
        this.id = id;
        this .name = name;
        docs = new ArrayDeque<>();
    }

    public void addDocument(String newDoc){
        docs.push(newDoc);
    }

    public void attend(){
        while(!docs.isEmpty()){
            System.out.println("Documento retirado: " + docs.pop());
        }

    }
    @Override
    public String toString() {
        return "Cliente{id=" + id + ", name='" + name + "', docs=" + docs + "}";
    }

    public static void main(String[] args) {

        Queue<Cliente> cliente= new ArrayDeque<>();

        Cliente c1= new Cliente(1, "Juanito");
        c1.addDocument("Doc 1 de Juanito");
        c1.addDocument("Doc 2 de Juanito");

        Cliente c2 = new Cliente(2, "Pedro");
        c2.addDocument("Doc 1 de Pedro");
        c2.addDocument("Doc 2 de Pedro");

         Cliente c3= new Cliente(1, "Chema");
        c3.addDocument("Doc 1 de Chema");
        c3.addDocument("Doc 2 de Chema");


        cliente.offer(c1);
        cliente.offer(c2);
        cliente.offer(c3);
   

        for (Cliente c : cliente) {
            System.out.println(c);
        }    


      Cliente atendido = cliente.poll();
        System.out.println("Atendiendo a cliente: " + atendido.name);
        if (atendido != null) {
            atendido.attend();
        }

        cliente.poll();

        System.out.println("Siguientes cliente en la fila:[" + c2.name + ", " + c3.name + "]");

    }

    

}
