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
        System.out.println("");
        workersList.printEmployees();
        System.out.println("\n");
        System.out.println("Общие затраты на зарплату " + workersList.calculateTotalSalary());
        System.out.println("Наименьшая зарплата у " + workersList.findMinimalSalary());
        System.out.println("Наибольшая зарплата у " + workersList.findMaximalSalary());
        System.out.println("Средняя зарплата " + workersList.calculateAverageSalary());
        workersList.printEmployeeList();
        workersList.indexSalary(5);
        System.out.println("Зарплаты после индексирования" + workersList.calculateTotalSalary());
        System.out.println("В данном отделе наименьшая зарплата у " + workersList.findDepartmentMinSalary(2));
        System.out.println("В данном отделе наибольшая зарплата у " + workersList.findDepartmentMaxSalary(2));
        System.out.println("Средняя зарпалта по отделу = " + workersList.calculateAverageDepartmentSalary(2));
        workersList.indexDepartmentSalary(2, 7);
        workersList.printDepartmentEmployees(2);
        workersList.findEmployeesThatHaveSalaryLessThan(141000);
        workersList.findEmployeesThatHaveSalaryMoreThan(141000);
        workersList.editEmployeeSalary("Alexey", "Navalniy", "Anatolevich", 121204.7);
        workersList.editEmployeeDepartment("Alexey", "Navalniy", "Anatolevich", 4);
        workersList.printEmployeesInDepartment();
    }
}
