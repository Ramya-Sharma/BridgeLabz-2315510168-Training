import java.util.ArrayList;
import java.util.List;

// Employee class (exists only within Department)
class Employee {
    private String name;
    public Employee(String name) { this.name = name; }
    public String getName() { return name; }
}

// Department class (exists only within Company)
class Department {
    private String deptName;
    private List<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void showDepartment() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            System.out.println("  Employee: " + e.getName());
        }
    }
}

// Company class (Composition)
class Company {
    private String companyName;
    private List<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void showCompany() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showDepartment();
        }
    }
}

public class CompanyCompositionExample {
    public static void main(String[] args) {
        Company c1 = new Company("TechCorp");
        Department d1 = new Department("HR");
        Department d2 = new Department("IT");

        d1.addEmployee(new Employee("Alice"));
        d1.addEmployee(new Employee("Bob"));
        d2.addEmployee(new Employee("Charlie"));

        c1.addDepartment(d1);
        c1.addDepartment(d2);

        c1.showCompany();

        // When Company object is dereferenced, all depts and employees go with it
        c1 = null;
        System.out.println("Company deleted, departments and employees deleted as well.");
    }
}