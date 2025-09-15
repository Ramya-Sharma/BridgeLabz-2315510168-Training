import java.util.ArrayList;
import java.util.List;

// Course class (association with Student)
class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Student s) {
        enrolledStudents.add(s);
    }

    public void showEnrolledStudents() {
        System.out.println("Course: " + courseName + " has students:");
        for (Student s : enrolledStudents) {
            System.out.println("  " + s.getName());
        }
    }
}

// Student class (association with Course)
class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() { return name; }

    public void enrollCourse(Course c) {
        courses.add(c);
        c.enrollStudent(this);
    }

    public void showCourses() {
        System.out.println("Student: " + name + " enrolled in:");
        for (Course c : courses) {
            System.out.println("  " + c);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}

// School aggregates students
class School {
    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void showStudents() {
        System.out.println("School: " + schoolName + " has students:");
        for (Student s : students) {
            System.out.println("  " + s.getName());
        }
    }
}

public class SchoolAssociationAggregationExample {
    public static void main(String[] args) {
        School school = new School("GLA University");

        Student s1 = new Student("Anushka");
        Student s2 = new Student("Rahul");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        school.showStudents();
        c1.showEnrolledStudents();
        c2.showEnrolledStudents();
    }
}