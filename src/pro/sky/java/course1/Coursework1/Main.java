package pro.sky.java.course1.Coursework1;

public class Main {


    public static void main(String[] args) {
        Employee employee1 = new Employee("Daniil ", "Ermolaev ", "Dmitrievich ", 138350.3, 1);
        Employee employee2 = new Employee("Alexey ", "Navalniy ", "Anatolevich ", 120132, 2); // не является пропагандой, идей не было
        Employee employee3 = new Employee("Musinov ", "Vyacheslav ", "Artemovich ", 210813.5, 3);
        Employee employee4 = new Employee("Molokanov ", "Nikita ", "Romanovich ", 138350.3, 4);
        Employee employee5 = new Employee("Ivanov ", "Ivan ", "Ivanovich ", 125373.8, 2);
        EmployeeBook workersList = new EmployeeBook();
        workersList.addNewEmployee(employee1);
        workersList.addNewEmployee(employee2);
        workersList.addNewEmployee(employee3);
        workersList.addNewEmployee(employee4);
        workersList.addNewEmployee(employee5);
        workersList.printEmployees();
        System.out.println("\n");
        System.out.println("Общие затраты на зарплату " + workersList.generalSalary());
        System.out.println("Наименьшая зарплата у " + workersList.minimalSalary());
        System.out.println("Наибольшая зарплата у " + workersList.maximalSalary());
        System.out.println("Средняя зарплата " + workersList.averageSalary());
        workersList.printEmployeeList();
        workersList.salaryIndexing(5);
        System.out.println("Зарплаты после индексирования" + workersList.generalSalary());
        System.out.println("В данном отделе наименьшая зарплата у " + workersList.departmentMinSalary(2));
        System.out.println("В данном отделе наибольшая зарплата у " + workersList.departmentMaxSalary(2));
        System.out.println("Средняя зарпалта по отделу = " + workersList.averageDepartmentSalary(2));
        workersList.departmentSalaryIndexing(2, 7);
        workersList.printDepartmentEmployees(2);
        workersList.employeesThatHaveSalaryLessThan(141000);
        workersList.employeesThatHaveSalaryMoreThan(141000);
        workersList.editEmployee("Alexey", "Navalniy", "Anatolevich", 124756.1, 4);
        workersList.printEmployeesInDepartment();
    }
}
