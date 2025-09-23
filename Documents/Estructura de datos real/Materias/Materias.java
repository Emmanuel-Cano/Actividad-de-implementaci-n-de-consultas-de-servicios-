import java.util.ArrayList;

class ListaMaterias{
    private ArrayList<String> materias = new ArrayList<>();

    public void addMateria(String materia){
        materias.add(materia);
    }

    public boolean contiene(String materia){
        for (String m : materias) {
            if (m.equals(materia)) {
                return true;
            }
        }
        return false;
    }
    public void imprimir(){
        System.out.println("Materias: " + materias);
    }
}

public class Materias {
    public static void main(String[] args) {
        ListaMaterias lista = new ListaMaterias();
        lista.addMateria("Base de Datos");
        lista.addMateria("Estructura de Datos");
        lista.addMateria("Aplicaciones web");
        lista.addMateria("Programacion Orientada a Objetos");
        lista.addMateria("Aplicaciones moviles");
        lista.addMateria("Sistemas Operativos");

        lista.imprimir();

        String materiaBuscada = "Estructura de Datos";
        System.out.println("Buscar materia: " + materiaBuscada);
        if (lista.contiene(materiaBuscada)){
            System.out.println("La materia " + materiaBuscada + " se encuentra en la lista.");
        } else {
            System.out.println("La materia " + materiaBuscada + " no se encuentra en la lista.");
        }
    }



}