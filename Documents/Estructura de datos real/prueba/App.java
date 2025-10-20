import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // 1. Crear 6 tickets mezclados
        Ticket t1 = new Ticket("HIGH",1, "Falla crítica");
        Ticket t2 = new Ticket("NORMAL", 2, "Consulta general");
        Ticket t3 = new Ticket("HIGH", 3, "Corte del servicio");
        Ticket t4 = new Ticket("NORMAL", 4, "Solicitud de info");
        Ticket t5 = new Ticket("NORMAL",5, "Duda de facturación");
        Ticket t6 = new Ticket("HIGH", 6, "Urgente de cliente VIP");

        List<Ticket> lista = new ArrayList<>();
        lista.add(t1);
        lista.add(t2);
        lista.add(t3);
        lista.add(t4);
        lista.add(t5);
        lista.add(t6);

        Utils gestor = new Utils(lista);

        // 2. Mostrar lista original
        System.out.println("— Lista original —");
        for (Ticket t : lista) {
            System.out.println(t);
        }

        // 3. Clasificar en HIGH y NORMAL
        gestor.classifyRec(gestor.tickets, 0, gestor.highQ, gestor.normalQ);

        // 4. Atender HIGH primero
        System.out.println("\nAtendiendo HIGH");
        gestor.attendQueueRec(gestor.highQ, gestor.served);

        // 5. Luego atender NORMAL
        System.out.println("\nAtendiendo NORMAL");
        gestor.attendQueueRec(gestor.normalQ, gestor.served);

        // 6. Mostrar historial
        System.out.println("\nHistorial (Stack top→bottom):");
        System.out.println(gestor.served);
    }
}
