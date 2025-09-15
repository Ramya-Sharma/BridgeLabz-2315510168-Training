import java.util.ArrayList;
import java.util.List;

// Faculty class (aggregation - independent of University)
class Faculty {
    private String name;
    public Faculty(String name) { this.name = name; }
    public String getName() { return name; }
}

// Department class (composition - belongs only to University)
class UniDepartment {
    private String deptName;
    public UniDepartment(String deptName) { this.deptName = deptName; }
    public String getDeptName() { return deptName; }
}

// University class
class University {
    private String name;
    private List<UniDepartment> departments;
    private List<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(UniDepartment d) { departments.add(d); }
    public void addFaculty(Faculty f) { faculties.add(f); }

    public void showUniversity() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (UniDepartment d : departments) System.out.println("  " + d.getDeptName());
        System.out.println("Faculties:");
        for (Faculty f : faculties) System.out.println("  " + f.getName());
    }
}

public class UniversityCompositionAggregationExample {
    public static void main(String[] args) {
        University uni = new University("GLA University");
        uni.addDepartment(new UniDepartment("CSE"));
        uni.addDepartment(new UniDepartment("ECE"));

        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Prof. Mehta");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showUniversity();

        uni = null;
        System.out.println("University deleted -> Departments deleted too. Faculties still exist independently.");
    }
}