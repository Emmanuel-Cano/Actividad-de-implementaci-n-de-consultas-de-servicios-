import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

public class Utils {

    // Manejo de colas según prioridad
    public List<Order> orders;
    public Queue<Order> urgents;
    public Queue<Order> standards;
    public Deque<Order> history;

    public Utils(List<Order> orders){
        this.orders = orders;
        this.urgents = new ArrayDeque<>();
        this.standards = new ArrayDeque<>();
        this.history = new ArrayDeque<>();
    }

    // Método recursivo para clasificar pedidos
    public void clasificar(int index, List<Order> list, Queue<Order> urg, Queue<Order> std){
        if(index >= list.size()){
            return;
        }
        Order current = list.get(index);

        if("URGENT".equals(current.getCategory())){
            urg.add(current);
        } else {
            std.add(current);
        }

        clasificar(index + 1, list, urg, std);
    }
}
