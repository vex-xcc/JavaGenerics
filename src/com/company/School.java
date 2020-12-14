
import java.util.ArrayList;

public class School<T extends Student> {
String name;
String phoneNumber;
String address;

    ArrayList<T> students =new ArrayList<>();

    public void addStudent (T student){
        students.add(student);
        System.out.println(student.name+" Has been add successfully");
    }
    public <T> void numberOfStudent(T t){
        System.out.println(" You have : " +  students.size() + " " +  t.getClass().getSimpleName() );

    }
}
