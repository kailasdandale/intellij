package allInOne;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

    static List<Employee> employees = DataBase.getAll();

    public static void checkHowManyMaleAndFemaleEmployees() {

        Map<String, Long> employee = employees.stream()
                //  .filter(e -> e.getGender().equalsIgnoreCase("female"))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(employee);
    }

    public static void partitionByAge() {

        Map<Boolean, List<Employee>> male = employees.stream()

                .collect(Collectors.partitioningBy(e -> e.getAge() > 24, Collectors.toList()));
        System.out.println(male);
    }

    public static List<Employee> groupingByGender() {
        Map<String, List<Employee>> gender = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.toList()));

        List<Employee> employees =new ArrayList<>();
        for(List<Employee> employee:gender.values()){
            employees.addAll(employee);
        }
        return employees;
    }

    public static void highSalaryOfHrEmployee() {

        Employee highSalaryOfHr = employees.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase("Hr"))

                .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get();
        System.out.println(highSalaryOfHr);
    }

    public static void getNameOfEmployeeSalaryIsGraterThan45000() {

        Map<String, List<String>> name = employees.stream()
                .filter(e -> e.getSalary() > 45000)
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getFirstname, Collectors.toList())));
        System.out.println(name);

    }

    public static void secondHighSalaryOfEmployee() {

        Employee employee = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .limit(1)
                .findAny().get();
        System.out.println(employees);
        System.out.println("second higest");
        System.out.println(employee);
    }
    public static void main(String[] args) {
        //  checkHowManyMaleAndFemaleEmployees();
        List<Employee> employees1 = groupingByGender();
        System.out.println(employees1);
        // partitionByAge();
        // highSalaryOfHrEmployee();
        //   getNameOfEmployeeSalaryIsGraterThan45000();
        //  secondHighSalaryOfEmployee();
    }
}
