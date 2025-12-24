package OOP;

import java.util.List;
import java.util.ArrayList;

public class SchoolManagementSystem {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(1, "Mr. Smith");
        Teacher t2 = new Teacher(2, "Mrs. Johnson");

        Courses math = new Courses("MTH101", "Mathematics", t1);
        Courses physics = new Courses("PHY101", "Physics", t2);

        Students s1 = new Students(101, "Alice");
        Students s2 = new Students(102, "Bob");

        s1.enroll(math);
        s1.enroll(physics);
        s2.enroll(math);

        s1.listCourses();
        s2.listCourses();

        math.listStudents();
        physics.listStudents();
    }
}
class Students{
    private final int id;
    private final String name;
    private final List<Enrollment> enrollments;

    public Students(int id, String name){
        this.id = id;
        this.name = name;
        enrollments  = new ArrayList<>();
    }

    public void enroll(Courses course){
        Enrollment enrollment = new Enrollment(this, course);
        enrollments.add(enrollment);
        course.addEnrollment(enrollment);
    }

    public void listCourses(){
        System.out.println("Course(s) for " + name + ": ");
        for(Enrollment e : enrollments){
            System.out.println("- " + e.getCourse().getTitle());
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
class Teacher{
    private final int id;
    private final String name;
    private final List<Courses> coursesTaught;

    public Teacher(int id, String name){
        this.id = id;
        this.name = name;
        coursesTaught = new ArrayList<>();
    }

    public void addCourse(Courses course){
        coursesTaught.add(course);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
class Courses{
    private final String code;
    private final String title;
    private final Teacher teacher;
    private final List<Enrollment> enrollments;

    public Courses(String code, String title, Teacher teacher){
        this.code = code;
        this.title = title;
        this.teacher = teacher;
        enrollments = new ArrayList<>();
        teacher.addCourse(this);
    }

    public void addEnrollment(Enrollment enrollment){
        enrollments.add(enrollment);
    }

    public void listStudents(){
        System.out.println("Students in " + title + ": ");
        for(Enrollment e : enrollments){
            System.out.println("- " + e.getStudent().getName() + " with student id: " + e.getStudent().getId());
        }
    }

    public String getTitle() {
        return title;
    }
}
class Enrollment{
    private final Students student;
    private final Courses course;

    public Enrollment(Students student, Courses course){
        this.student = student;
        this.course = course;
    }

    public Students getStudent(){
        return student;
    }

    public Courses getCourse(){
        return course;
    }
}