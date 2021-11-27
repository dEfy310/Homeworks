package pro.sky.java.course1.Coursework1;

public class Employee  {

    private final String firstName;
    private final String middleName;
    private final String lastName;
    private double salary;
    private int department;
    private static int counter = 0;
    private final int id;

    public Employee(String firstName, String middleName, String lastName, double salary, int department ) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
        this.id = counter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Сотрудник " +
                " Имя: " + firstName +
                " Фамилия: " + middleName + '\'' +
                " Отчество: " + lastName + '\'' +
                " Зарплата: " + salary +
                " Отдел: " + department +
                ", id=" + id;
    }

}
