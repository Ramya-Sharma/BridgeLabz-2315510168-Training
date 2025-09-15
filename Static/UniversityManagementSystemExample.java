import java.util.ArrayList;
import java.util.List;

// Course class
class Course {
    private String name;
    private Professor professor;
    private List<StudentUMS> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void assignProfessor(Professor p) {
        this.professor = p;
        System.out.println("Professor " + p.getName() + " assigned to course " + name);
    }

    public void enrollStudent(StudentUMS s) {
        students.add(s);
        System.out.println("Student " + s.getName() + " enrolled in " + name);
    }

    public void showCourse() {
        System.out.println("Course: " + name);
        if (professor != null) System.out.println("  Professor: " + professor.getName());
        System.out.println("  Students:");
        for (StudentUMS s : students) System.out.println("    " + s.getName());
    }
}

// Student class
class StudentUMS {
    private String name;
    public StudentUMS(String name) { this.name = name; }
    public String getName() { return name; }
    public void enrollCourse(Course c) { c.enrollStudent(this); }
}

// Professor class
class Professor {
    private String name;
    public Professor(String name) { this.name = name; }
    public String getName() { return name; }
}

public class UniversityManagementSystemExample {
    public static void main(String[] args) {
        StudentUMS s1 = new StudentUMS("Anushka");
        StudentUMS s2 = new StudentUMS("Rahul");

        Professor p1 = new Professor("Dr. Mehta");

        Course c1 = new Course("Data Structures");
        Course c2 = new Course("AI & ML");

        c1.assignProfessor(p1);

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s1.enrollCourse(c2);

        c1.showCourse();
        c2.showCourse();
    }
}