import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Order o1 = new Order(1, "URGENT", "Zapatos");
        Order o2 = new Order(2, "STANDARD", "Playera");
        Order o3 = new Order(3, "STANDARD", "Cargador");
        Order o4 = new Order(4, "URGENT", "Videojuego");
        Order o5 = new Order(5, "STANDARD", "Funda");
        Order o6 = new Order(6, "URGENT", "Celular");
        List<Order> pedidos = new ArrayList<>();
        pedidos.add(o1);
        pedidos.add(o2);
        pedidos.add(o3);
        pedidos.add(o4);
        pedidos.add(o5);
        pedidos.add(o6);
        Utils gestor = new Utils(pedidos);
        System.out.println("Lista de pedidos inicial:");
        for(Order o: gestor.orders){
            System.out.println(o);
        }
        gestor.clasificar(0, gestor.orders, gestor.urgents, gestor.standards);
        System.out.println("\n Pedidos urgentes: " + gestor.urgents);
        System.out.println("Pedidos estándar: " + gestor.standards);
        System.out.println("\n--- Procesando urgentes ---");
        while(!gestor.urgents.isEmpty()){
            Order actual = gestor.urgents.poll();
            System.out.println("Atendiendo: " + actual.getDescription());
            gestor.history.add(actual);
        }
        System.out.println("\n--- Procesando estándar ---");
        while(!gestor.standards.isEmpty()){
            Order actual = gestor.standards.poll();
            System.out.println("Atendiendo: " + actual.getDescription());
            gestor.history.add(actual);
        }
        System.out.println("\nHistorial de atención: " + gestor.history);
    }
}
