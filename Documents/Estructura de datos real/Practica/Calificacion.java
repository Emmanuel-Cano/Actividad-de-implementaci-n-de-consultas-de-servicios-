import java.util.ArrayList;


class ListaCalificaciones{
    private final ArrayList<Integer> calificaciones = new ArrayList<>();

    public void addCalificacion(int calificacion) {
        calificaciones.add(calificacion);
    }

    public boolean contiene(int calificacion){
        for(int c: calificaciones){
            if(c == calificacion)
                return true;
        }
        return false;
    }

    public void obtenerPromedio(){
        double suma = 0;
        for(int c: calificaciones){
            suma += c;
        }
        System.out.println("Promedio: " + (suma/calificaciones.size()));
    }
    public void imprimir(){
        System.out.println("Calificaciones en el sistemas: " + calificaciones);
    }

}

public class Calificacion{

    public static void main(String[] args) {
        ListaCalificaciones lista = new ListaCalificaciones();
        lista.addCalificacion(10);
        lista.addCalificacion(8);
        lista.addCalificacion(9);
        lista.addCalificacion(7);
        lista.addCalificacion(6);
        lista.addCalificacion(5);

        lista.imprimir();
        int calificacionBuscada = 8;
        System.out.println("Buscando calificacion: " + calificacionBuscada);
        if(lista.contiene(calificacionBuscada)){
            System.out.println("La calificacion " + calificacionBuscada + " si se encuentra en el sistema");
        } else {
            System.out.println("La calificacion " + calificacionBuscada + " no se encuentra en el sistema");
        }

        lista.obtenerPromedio();
    }

}