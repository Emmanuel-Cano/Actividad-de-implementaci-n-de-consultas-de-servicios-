import java.util.ArrayList;
import java.util.List;

public class Utils {

    // declarado e inicializado?
    List<Student> students;
    List<Student> reveseList = new ArrayList<>();

    Utils(List<Student> students) {
        this.students = students;
    }

    public List<Student> reverse(List<Student> students) {
        if (students.isEmpty()) {
            return students;
        }
        Student student = students.get(0);
        students.remove(0);
        reverse(students);
        this.reveseList.add(student);
        return this.reveseList;

    }

}
