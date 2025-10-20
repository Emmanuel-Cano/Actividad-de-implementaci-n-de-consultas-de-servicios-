import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

public class Utils{

    public List<Order> orders;
    public Queue<Order> urgentQ;
    public Queue<Order> standarQ;
    public Deque<Order> served;

    public Utils(List<Order> orders){
        this.orders = orders;
        this.urgentQ = new ArrayDeque<>();
        this.standarQ = new ArrayDeque<>();
        this.served = new ArrayDeque<>();
    }

    public void recorrido(int id, List<Order> orders, Queue<Order> urgentQ, Queue<Order> standarQ){
        if(id >= orders.size()){
            return;
        }
        Order order = orders.get(id);
        if(order.getDesc().equals("URGENT")){
            urgentQ.offer(order);

        }else if(order.getDesc().equals("STANDARD")){
            standarQ.offer(order);
        }
        recorrido(id +1, orders, urgentQ, standarQ);
    }
    


}