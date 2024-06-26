import java.util.Comparator;

/**
 * StudentComparator
 */
public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return student1.GetName().compareTo(student2.GetName());
    }

}