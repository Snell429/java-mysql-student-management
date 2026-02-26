

public class Student {
    private int id;
    private String name;
    private String email;
    private int age;
    private String className;

    public Student(int id, String name, String email, int age, String className) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.className = className;
    }

    public Student(String name, String email, int age, String className) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.className = className;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public int getAge() { return age; }
    public String getClassName() { return className; }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", className='" + className + '\'' +
                '}';
    }
}