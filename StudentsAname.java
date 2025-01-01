import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentsAname {

    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Anand");
        students.add("Bala");
        students.add("Ajith");
        students.add("Chandran");
        students.add("Alex");
        students.add("David");
        students.add("Easwaran");
        students.add("Anbu");
        students.add("Karthik");
        students.add("Andavar");

        List<String> studentsWithA = students.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Students with names starting with 'A': " + studentsWithA);
    }
}