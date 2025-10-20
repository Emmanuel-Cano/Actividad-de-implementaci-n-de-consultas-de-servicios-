import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Utils {

    public List<Ticket> tickets;     // lista original
    public Queue<Ticket> highQ;      // cola HIGH
    public Queue<Ticket> normalQ;    // cola NORMAL
    public Stack<Ticket> served;     // historial (stack)

    public Utils(List<Ticket> tickets) {
        this.tickets = tickets;
        this.highQ = new ArrayDeque<>();
        this.normalQ = new ArrayDeque<>();
        this.served = new Stack<>();
    }

    // Método recursivo para clasificar tickets
    public void classifyRec(List<Ticket> list, int idx, Queue<Ticket> highQ, Queue<Ticket> normalQ) {
        if (idx == list.size()) {
            return; // caso base
        }
        Ticket t = list.get(idx);
        if ("HIGH".equals(t.getLevel())) {
            highQ.add(t);
        } else {
            normalQ.add(t);
        }
        classifyRec(list, idx + 1, highQ, normalQ); // paso recursivo
    }

    // Método recursivo para atender tickets en una cola
    public void attendQueueRec(Queue<Ticket> q, Stack<Ticket> served) {
        if (q.isEmpty()) {
            return; // caso base
        }
        Ticket t = q.poll(); // sacar ticket de la cola
        System.out.println("— Atendiendo: " + t);
        served.push(t); // guardar en historial
        attendQueueRec(q, served); // paso recursivo
    }
}
