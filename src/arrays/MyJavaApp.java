package arrays;

import java.util.Comparator;

public class MyJavaApp {
    public static void main(String[] args) {
        System.out.println("Hello World, Java Program");

        Employee[] employeeArray = new Employee[3];
        employeeArray[0] = new Employee("Xander", 1);
        employeeArray[1] = new Employee("John",3);
        employeeArray[2] = new Employee("Anna",2);

        java.util.Arrays.sort(employeeArray, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.name.compareTo(e2.name);
            }
        });

        System.out.println("Sort by Employee Name:");
        for (int i = 0; i < employeeArray.length; i++){
            System.out.println(employeeArray[i].name);
        }


        java.util.Arrays.sort(employeeArray, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.employeeId - e2.employeeId;
            }
        });
        System.out.println("Sort by Employee Id:");
        for (int i = 0; i < employeeArray.length; i++){
            System.out.println(employeeArray[i].name);
        }

        java.util.Arrays.sort(employeeArray, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                int nameDiff = e1.name.compareTo(e2.name);
                if (nameDiff != 0)
                    return nameDiff;
                return e1.employeeId - e2.employeeId;
            }
        });
        System.out.println("Sort by Employee Name then Employee Id:");
        for (int i = 0; i < employeeArray.length; i++){
            System.out.println(employeeArray[i].name);
        }
    }
}
