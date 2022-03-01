package SortEmployeeObjects;

import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeSet {
    public static void main(String[] args) {
        TreeSet<Employee> Employee_salarysort = new TreeSet<>(new SalaryComparator());
        Employee_salarysort.add(new Employee("012","a", "dept1",40000));
        Employee_salarysort.add(new Employee("013","b", "dept2",47000));
        Employee_salarysort.add(new Employee("014","c", "dept3",36000));
        Employee_salarysort.add(new Employee("015","d", "dept4",39000));
        Employee_salarysort.add(new Employee("016","e", "dept5",69000));
        Employee_salarysort.add(new Employee("017","f", "dept6",70000));
        Employee_salarysort.add(new Employee("018","g", "dept7",48000));
        Employee_salarysort.add(new Employee("019","h", "dept8",50000));
        Employee_salarysort.add(new Employee("007","i", "dept9",49000));
        Employee_salarysort.add(new Employee("000","j", "dept10",5500));

        TreeSet<Employee> Employee_IDsort = new TreeSet<>(new IdComparator());
        Employee_IDsort.add(new Employee("012","a", "dept1",40000));
        Employee_IDsort.add(new Employee("013","b", "dept2",47000));
        Employee_IDsort.add(new Employee("014","c", "dept3",36000));
        Employee_IDsort.add(new Employee("015","d", "dept4",39000));
        Employee_IDsort.add(new Employee("016","e", "dept5",69000));
        Employee_IDsort.add(new Employee("017","f", "dept6",70000));
        Employee_IDsort.add(new Employee("018","g", "dept7",48000));
        Employee_IDsort.add(new Employee("019","h", "dept8",50000));
        Employee_IDsort.add(new Employee("007","i", "dept9",49000));
        Employee_IDsort.add(new Employee("000","j", "dept10",5500));

        TreeSet<Employee> Employee_Deptsort = new TreeSet<>(new DepartmentComparator());
        Employee_Deptsort.add(new Employee("012","a", "dept1",40000));
        Employee_Deptsort.add(new Employee("013","b", "dept2",47000));
        Employee_Deptsort.add(new Employee("014","c", "dept3",36000));
        Employee_Deptsort.add(new Employee("015","d", "dept4",39000));
        Employee_Deptsort.add(new Employee("016","e", "dept5",69000));
        Employee_Deptsort.add(new Employee("017","f", "dept6",70000));
        Employee_Deptsort.add(new Employee("018","g", "dept7",48000));
        Employee_Deptsort.add(new Employee("019","h", "dept8",50000));
        Employee_Deptsort.add(new Employee("007","i", "dept9",49000));
        Employee_Deptsort.add(new Employee("000","j", "dept10",5500));

        TreeSet<Employee> Employee_Namesort = new TreeSet<>(new NameComparator());
        Employee_Namesort.add(new Employee("012","a", "dept1",40000));
        Employee_Namesort.add(new Employee("013","b", "dept2",47000));
        Employee_Namesort.add(new Employee("014","c", "dept3",36000));
        Employee_Namesort.add(new Employee("015","d", "dept4",39000));
        Employee_Namesort.add(new Employee("016","e", "dept5",69000));
        Employee_Namesort.add(new Employee("017","f", "dept6",70000));
        Employee_Namesort.add(new Employee("018","g", "dept7",48000));
        Employee_Namesort.add(new Employee("019","h", "dept8",50000));
        Employee_Namesort.add(new Employee("007","i", "dept9",49000));
        Employee_Namesort.add(new Employee("000","j", "dept10",55000));

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Employee object to sort with : ");
        String input = scan.nextLine();
        String sort = input.toLowerCase();

        if(sort.equals("id"))
            System.out.println(Employee_IDsort);
        else if (sort.equals("name"))
            System.out.println(Employee_Namesort);
        else if (sort.equals("department"))
            System.out.println(Employee_Deptsort);
        else if (sort.equals("salary"))
            System.out.println(Employee_salarysort);
        else
            System.out.println("Not an Employee object, Please enter Employee object");



    }
}
