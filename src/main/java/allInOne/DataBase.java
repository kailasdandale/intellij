package allInOne;

import java.util.Arrays;
import java.util.List;

public class DataBase {

    public static List<Employee> getAll() {

        return Arrays.asList(
                new Employee(1, "ravi", "jadhav", 24, "ravi@gmal.com", "HR", "MALE", 34000),
                new Employee(2, "Dipak", "pawar", 26, "dipak@gmal.com", "WEB", "MALE", 45000),
                new Employee(3, "Dipali", "ratan", 23, "dipali@gmal.com", "HR", "FEMALE", 56000),
                new Employee(4, "Pooja", "Tidke", 21, "poja@gmal.com", "WEB", "FEMALE", 65000),
                new Employee(5, "Poonam", "Kapur", 22, "poonam@gmal.com", "HR", "FEMALE", 68000),
                new Employee(6, "Kumar", "RANA", 29, "kumar@gmal.com", "WEB", "MALE", 45000));
    }

}
