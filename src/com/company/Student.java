
public abstract class Student<T> {
    String name;
    int age;
    String emailAddress;

    public Student(String name, int age, String emailAddress) {
        this.name = name;
        this.age = age;
        this.emailAddress = emailAddress;
    }
}
