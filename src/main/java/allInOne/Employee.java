package allInOne;

public class Employee {

    private int id;
    private String firstname;
    private String lastName;
    private int age;
    private String email;
    private String department;
    private String gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double salary;

    public Employee(int id, String firstname, String lastName, int age, String email, String department, String gender, double salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.department = department;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee() {
    }
}
