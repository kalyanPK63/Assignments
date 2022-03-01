package Generics;

public class Employee {

    String id, department, name;
    int salary;

    public void id(String id) {
        this.id = id;
    }
    public void department(String department) {
        this.department = department;
    }
    public void salary(int salary) {
        this.salary = salary;
    }
    public void name(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Employee = {" +
                "id='" + id + '\'' +
                ", department='" + department + '\'' +
                ", name=" + name +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(displayDetails());

    }

    private static Employee displayDetails() {
        Employee e1 = new Employee();
        e1.name("Pavan");
        e1.id("123456");

        return e1;
    }

}
