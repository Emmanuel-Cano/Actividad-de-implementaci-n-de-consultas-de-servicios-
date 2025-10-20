
import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void main(String[] args){
        Order o1 = new Order("URGENT", 1, "Zapatos");
        Order o2 = new Order("STANDARD", 2, "Zapatos");
        Order o3 = new Order("URGENT", 3, "Zapatos");
        Order o4 = new Order("URGENT", 4, "Zapatos");
        Order o5 = new Order("STANDARD", 5, "Zapatos");
        Order o6 = new Order("STANDARD", 6, "Zapatos");
        List<Order> lista = new ArrayList<>();
        lista.add(o1);
        lista.add(o2);
        lista.add(o3);
        lista.add(o4);
        lista.add(o5);
        lista.add(o6);
        Utils utils = new Utils(lista);
        System.out.println("Lista de orderns");
        for(Order order: utils.orders){
            System.out.println(order.toString());
        }
        utils.recorrido(0, utils.orders, utils.urgentQ, utils.standarQ); 
        System.out.println("Lista de ordeenes urgentes" + utils.urgentQ);
        System.out.println("Lista de ordeenes standards" + utils.standarQ);
        System.out.println("Procesar ordenes");
        for(Order order: utils.urgentQ){
            System.out.println("Se esta surtiendo " + order.toString());
            utils.served.offer(utils.urgentQ.poll());
            if(utils.urgentQ.peek()!=null){
                System.out.println("Siguiente pedido " + utils.urgentQ.peek().getDesc());
            }else{
                System.out.println("No hay mas pedidos urgentes");  
            }
        }
        System.out.println("Procesar ordenes standars");
        for(Order order: utils.standarQ){
            System.out.println("Se esta surtiendo " + order.toString());
            utils.served.offer(utils.standarQ.poll());
            if(utils.standarQ.peek()!=null){
                System.out.println("Siguiente pedido " + utils.standarQ.peek().getDesc());
            }else{
                System.out.println("No hay mas pedidos standars");  
            }

    }
    System.out.println("Se terminaron de surtir las ordenes");
    System.out.println("Historial de ordenes: " + utils.served);
}
}