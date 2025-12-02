package OOP;

public class StudentDetails {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("John");
        student.setRollNo(1);
        student.setMarks(90);

        System.out.println(student.getName());
        System.out.println(student.getRollNo());
        System.out.println(student.getMarks());
        System.out.println(student);
    }
}

class Student{
    private String name;
    private int rollNo;
    private int marks;

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Name= " + name + ", rollNo= " + rollNo + ", marks= " + marks + ".";
    }
}
