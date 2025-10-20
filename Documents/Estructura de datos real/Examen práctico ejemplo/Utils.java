import java.util.ArrayList;
import java.util.List;

public class Utils{


    // declarado e inicializado?
    List<Student> students;
    List<Student> reverseList = new ArrayList<>();


    Utils(List<Student> students){

        this.students = students;

    }

    public List<Student> reverse(List<Student> students, int index){
        if(index < 0){
            return reverseList;
        }

        this.reverseList.add(students.get(index));
        return reverse(students, index - 1);

    }

}