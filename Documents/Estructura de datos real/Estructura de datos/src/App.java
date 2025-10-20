import java.util.ArrayDeque;
import java.util.Deque;

public class App {


  /*     static class Trabajador {
        int id;
        String nombre;
        double sueldo;

        public Trabajador(int id, String nombre, double sueldo) {
            this.id = id;
            this.nombre = nombre;
            this.sueldo = sueldo;
        }

        @Override
        public String toString() {
            return "Trabajador{id=" + id + ", nombre='" + nombre + "', sueldo=" + sueldo + "}";
        }
    } */

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


 /*         List<Trabajador> trabajador = new ArrayList<>();
        trabajador.add(new Trabajador(1, "juan", 950));
        trabajador.add(new Trabajador(2, "chema", 1200));
        trabajador.add(new Trabajador(3, "juan gabriel", 1100));
        trabajador.add(new Trabajador(4, "joan sebastian", 800));
        trabajador.add(new Trabajador(5, "vicente fernandez", 1500));
        trabajador.add(new Trabajador(6, "jose jose", 990));

        double suma = 0;
        for (Trabajador t : trabajador) {
            suma = suma + t.sueldo;
        }
        double promedio = suma / 6;
        System.out.println("Promedio de sueldo: " + promedio);

        trabajador.removeIf(t -> t.sueldo < 1000);

        System.out.println("Lista actualizada:");
        for (Trabajador t : trabajador) {
            System.out.println(t);
        }
 */
    
        


        Deque<String> historial = new ArrayDeque<>();

      
        historial.push("https://www.google.com");
        historial.push("https://www.github.com");
        historial.push("https://www.microsoft.com");

        historial.pop();

        System.out.println("Página actual: " + historial.peek());

        historial.push("https://www.roblox.com");

        System.out.println("Historial:");
        for (String pagina : historial) {
            System.out.println(pagina);
        }





    }
}
