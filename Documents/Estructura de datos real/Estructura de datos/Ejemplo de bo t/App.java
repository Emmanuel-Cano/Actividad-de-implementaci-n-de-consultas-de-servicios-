import java.util.ArrayList;
import java.util.List;

public class App{


    public static <T> void printArray(T[] array){
        for(T v: array){
            if(v instanceof Student){
                System.out.println(v);
            } 
            //System.out.println(v);
        }

    }
    public static void main(String[] args) {
        
        Box<String> box1 = new Box<>("Esta es una caja de strings");
        List<String> lista = new ArrayList<>();
        System.out.println(box1.getValue());
        Box<Integer> box2 = new Box<>(3);
        System.out.println(box2.getValue());

        Pair<String, Integer> pair = new Pair<String, Integer>("Id", 3);
        System.out.println("La key es: " + pair.getKey());
        System.out.println("El value es: " + pair.getValue());

        String[] arrayString = {"Hola1, Hola2, Hola3"};
        Integer[] arrayInteger = {1,2,3,4,5};

        printArray(arrayString);

        System.out.println("---------------------------");
        printArray(arrayInteger);
        System.out.println("***********************************");
        Student[] students = new Student[2];
        Student st1 = new Student(1, "Juan");
        Student st2 = new Student(2, "Karla");
        students[0] = st1;
        students[1] = st2;

        printArray(students);

        Trabajador[] trabajador = new Trabajador[2];
        Trabajador t1 = new Trabajador(1, "Juan");
        Trabajador t2 = new Trabajador(2, "Karla");
        trabajador[0] = t1;
        trabajador[1] = t2;

        printArray(trabajador);


    }
}