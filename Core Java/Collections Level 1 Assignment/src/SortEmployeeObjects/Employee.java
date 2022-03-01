package SortEmployeeObjects;

public class Employee {
    private String ID;
    private String Name;
    private String Department;
    private int Salary;

    public Employee(String ID, String name, String department, int salary) {
        this.ID = ID;
        this.Name = name;
        this.Department = department;
        this.Salary = salary;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getDepartment() {
        return Department;
    }

    public int getSalary() {
        return Salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                ", Department='" + Department + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
