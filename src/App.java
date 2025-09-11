
import java.util.ArrayDeque;
import java.util.Deque;

public class App {
    public static void main(String[] args) throws Exception {

  /*       //Crear una lista
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mangoo");
        fruits.add("Apple");
        //Recorrer
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println(fruits.get(2));
        fruits.remove(2);
        System.out.println("Lista despues de eliminar: " + fruits);
        fruits.remove("Apple");
        System.out.println("Lista:" + fruits);
        fruits.add("Grape");
        System.out.println("Nueva lista: " + fruits); */


/*         // Inicializacion
        Set<String> fruits = new HashSet<>();
        //Agregar elemntos el conjunto
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mangoo");
        fruits.add("Apple"); //omision por conjunto no permite duplicados
        for (String fruit: fruits){
            System.out.println(fruit);
        }
        fruits.remove("Banana");

        fruits.add("Grape");
        System.out.println("Set: " + fruits); */

/*         //Inicializacion
        Queue<String> fila = new ArrayDeque<>();
        //add
        fila.offer("Cliente1");
        fila.offer("Cliente2");
        fila.offer("Cliente3");
        //Recorrido


        for (String f : fila) {
            System.out.println(f);
        }    
        System.out.println("Atendiendo a cliente: " + fila.poll());
        
        fila.offer("NuevoCliente"); //Agregar nuevo cliente al final de la fila
        fila.poll(); //Quitar elemento de la fila
        System.out.println("Fila: " + fila);
        System.out.println("Siguiente: " + fila.peek()); //Primero en fila */



/*         //Inicializacion
        Deque<String> libros = new ArrayDeque<>(); // Esta es la recomendada
         //Agregar
        libros.push("Libro1");
        libros.push("Libro2");
        libros.push("Libro3");

        //Recorrido
        for (String libro : libros) {
            System.out.println(libro);
        }
        //Eliminar
        System.out.println("Quitando a: " + libros.pop());

        libros.push("NuevoLibro");
        libros.pop();
        libros.pop();

        System.out.println("Stack: " + libros);
 */


    
        

    }
}
