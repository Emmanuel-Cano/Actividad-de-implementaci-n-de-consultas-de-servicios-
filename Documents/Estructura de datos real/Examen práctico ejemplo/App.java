
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

public class App{
    public static void main(String[] args) throws Exception{
        List<Student> students = new ArrayList<>();

        Student s1 = new Student("email1", 1, "Juan");
        Student s2 = new Student("email2", 2, "Getsai");
        Student s3 = new Student("email3", 3, "Miguel");

        students.add(s1);
        students.add(s2);
        students.add(s3);

       System.out.println("Lista original: "+ students);
        System.out.println("-------------------------------------");       

        System.out.println("Lista invertida: ");
        Utils utils = new Utils(students);
        System.out.println(utils.reverse(students, students.size() - 1).toString());

        Queue<Student> fila= new ArrayDeque<>();
        Deque<Student> stack = new ArrayDeque<>();
        System.out.println("-------------------------------------"); 
        for(Student student: utils.reverseList){
            System.out.println("Elemento: " + student);
            fila.offer(student);
        }
        while(!fila.isEmpty()){
            Student s= fila.poll();
            System.out.println("En atencion:" + s);
            stack.push(s);

            if(fila.peek() == null){
                System.out.println("No hay nadie en la fila");
                break; 
            }
            System.out.println("El siguiente: " + fila.peek());

        }
        System.out.println("En la cima del stack esta: ");
        System.out.println(stack.peek());
    }
}