import java.io.*;
class Student implements Serializable{
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student{id=" + id + ", name=" + name + ", age=" + age + "}";
    }
}
class Course implements Serializable{
    private String courseCode ;
    private String courseName ;
    private String instructor ;

    public Course(String courseCode, String courseName, String instructor){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Course{code=" + courseCode + ", name=" + courseName + ", instructor=" + instructor + "}";
    }
}

class Enrollment implements Serializable{
    private Student student;
    private Course course;
    private String enrollmentDate;

    public Enrollment(Student student, Course course, String enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    @Override
    public String toString() {
        return "Enrollment{\n  " + student + ",\n  " + course + ",\n  date=" + enrollmentDate + "\n}";
    }
}


public class Main {
    private static final String FILENAME = "enrollments.ser";
    public static void main(String[] args) {
        Student student = new Student(1, "Yuki", 29);
        Course course = new Course("FOXTROT25", "DEFINETLY", "WHOEVERTHISIS");
        Enrollment enrollment = new Enrollment(student, course, "11.11.2026");
            try (
                    FileOutputStream outputstream = new FileOutputStream(FILENAME);
                    ObjectOutputStream objects = new ObjectOutputStream(outputstream);
            ) {
                objects.writeObject(enrollment);
                System.out.println("Enrollment saved to " + FILENAME);
            }catch (IOException e){
                System.err.println(e);
            }
            try (
                    FileInputStream inputStream = new FileInputStream(FILENAME);
                    ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            ){
                    Enrollment test =  (Enrollment) objectInputStream.readObject();
                    System.out.println(test);

            }catch (Exception e){
                System.err.println(e);
            }

        }
}
