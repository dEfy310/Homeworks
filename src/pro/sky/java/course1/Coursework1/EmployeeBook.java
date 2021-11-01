package pro.sky.java.course1.Coursework1;

public class EmployeeBook {
    private static final Employee[] employeesList = new Employee[10];


    public void printEmployeeList() {
        for (Employee employee : employeesList) {
            if (employee != null) {
                System.out.print("\n" + employee.getFirstName() + " " + employee.getMiddleName() + employee.getLastName() + " Зарплата:");
                System.out.print(employee.getSalary() + " Отдел:");
                System.out.print(employee.getDepartment() + " Id:");
                System.out.println(employee.getId() + "\n");
            }
        }
    }

    public double generalSalary() {
        double generalSalary = 0;
        for (Employee employeesSalary : employeesList) {
            if (employeesSalary != null) {
                generalSalary = generalSalary + employeesSalary.getSalary();
            }
        }
        return generalSalary;
    }

    public Employee minimalSalary() {
        double minimalSalary = Double.MAX_VALUE;
        int salaryId = 0;
        for (Employee employeeMinSalary : employeesList) {
            if (employeeMinSalary != null && employeeMinSalary.getSalary() < minimalSalary) {
                minimalSalary = employeeMinSalary.getSalary();
                salaryId = employeeMinSalary.getId();
            }
        }
        return employeesList[salaryId];
    }

    public Employee maximalSalary() {
        double maximalSalary = Double.MIN_VALUE;
        int salaryId = 0;
        for (Employee employeeMaxSalary : employeesList) {
            if (employeeMaxSalary != null && employeeMaxSalary.getSalary() > maximalSalary) {
                maximalSalary = employeeMaxSalary.getSalary();
                salaryId = employeeMaxSalary.getId();
            }
        }
        return employeesList[salaryId];
    }

    public double averageSalary() {
        double avgSalary = 0;
        for (Employee employeeSalary : employeesList) {
            if (employeeSalary != null) {
                avgSalary = generalSalary() / employeesList.length;
            }
        }
        return avgSalary;
    }

    public void printEmployees() {
        for (Employee employee : employeesList) {
            if (employee != null) {
                System.out.print("\n" + employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getLastName() + "\n");
            }
        }
    }


    public void salaryIndexing(double percent) {
        for (Employee employee : employeesList) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * percent/100);
            }
        }
    }

    public Employee departmentMinSalary(int department) {
        double minimalSalary = Double.MAX_VALUE;
        int salaryId = 0;
        for (Employee departmentMinSalary : employeesList) {
            if (departmentMinSalary != null && departmentMinSalary.getDepartment() == department) {
                if (departmentMinSalary.getSalary() < minimalSalary) {
                    minimalSalary = departmentMinSalary.getSalary();
                    salaryId = departmentMinSalary.getId();
                }
            } else {
                continue;
            }
        }
        return employeesList[salaryId];
    }

    public Employee departmentMaxSalary(int department) {
        double maximumSalary = Double.MIN_VALUE;
        int salaryId = 0;
        for (Employee departmentMaxSalary : employeesList) {
            if (departmentMaxSalary != null && departmentMaxSalary.getDepartment() == department) {
                if (departmentMaxSalary.getSalary() > maximumSalary) {
                    maximumSalary = departmentMaxSalary.getSalary();
                    salaryId = departmentMaxSalary.getId();
                }
            } else {
                continue;
            }
        }
        return employeesList[salaryId];
    }

    public double averageDepartmentSalary(int department) {
        int departmentCount = 0;
        double generalDepartmentSalary = 0;
        for (Employee averageDepartmentSalary : employeesList) {
            if (averageDepartmentSalary != null && averageDepartmentSalary.getDepartment() == department) {
                generalDepartmentSalary = generalDepartmentSalary + averageDepartmentSalary.getSalary();
                departmentCount++;
            }
        }
        return generalDepartmentSalary / departmentCount;
    }

    public void departmentSalaryIndexing(int department, double percent) {
        for (Employee employeeDepartment : employeesList) {
            if (employeeDepartment != null && employeeDepartment.getDepartment() == department) {
                employeeDepartment.setSalary(employeeDepartment.getSalary() + employeeDepartment.getSalary() * percent/100);
            }
        }
    }

    public void printDepartmentEmployees(int department) {
        for (Employee employee : employeesList) {
            if (employee != null && employee.getDepartment() == department) {
                if (employee != null) {
                    System.out.print("\n" + employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getLastName() + "Зарплата: ");
                    System.out.print(employee.getSalary() + " Id: ");
                    System.out.println(employee.getId() + "\n");
                }
            }
        }
    }

    public void employeesThatHaveSalaryLessThan(int Salary) {
        for (Employee employee : employeesList) {
            if (employee != null) {
                if (employee.getSalary() < Salary) {
                    System.out.print("\n" + employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getLastName() + "Зарплата: ");
                    System.out.print(employee.getSalary() + " Id: ");
                    System.out.println(employee.getId() + "\n");
                }
            }
        }
        System.out.println("===============================================");
    }

    public void employeesThatHaveSalaryMoreThan(int Salary) {
        for (Employee employee : employeesList) {
            if (employee != null) {
                if (employee.getSalary() >= Salary) {
                    System.out.print("\n" + employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getLastName() + "Зарплата: ");
                    System.out.print(employee.getSalary() + " Id: ");
                    System.out.println(employee.getId() + "\n");

                }
            }
        }
    }

    public void addNewEmployee(Employee employee) {
        System.out.println("\n");
        for (int i = 0; i <= employeesList.length; i++) {
            if (employeesList[i] == null) {
                employeesList[i] = employee;
                System.out.println("Сотрудник успешно добавлен!");
                return;
            }
        }
        System.out.println("Не удалось добавить сотрудника");
    }

    public void deleteEmployee(int id, String firstName, String secondName, String lastName) {
        System.out.println("\n");
        for (Employee employee : employeesList) {
            if (employee.getId() == id || (firstName.equals(employee.getFirstName()) && secondName.equals(employee.getMiddleName()) && (lastName.equals(employee.getLastName())))) {
                employee = null;
                System.out.println("Сотрудник успешно удален!");
                return;
            } else {
                System.out.println("Не удалось удалить сотрудника!");
            }
        }
    }

    public void editEmployee(String firstName, String secondName, String lastName, double salary, int department) {
        System.out.println("\n");
        for (Employee employee : employeesList) {
            if (employee != null) {
                if (firstName.equals(employee.getFirstName()) && secondName.equals(employee.getMiddleName()) && lastName.equals(employee.getLastName())) {
                    employee.setSalary(salary);
                    employee.setDepartment(department);
                    System.out.println("Зарплата сотрудника " + employee.getFirstName() + employee.getMiddleName() +
                            employee.getLastName() + " стала " + employee.getSalary() + " рублей. Номер нового отдела его работы: " + employee.getDepartment());
                    return;
                }
            }
        }
    }

    public void printEmployeesInDepartment() {
        System.out.println("\n");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Отдел" + i + ". Работники: ");
            for (Employee employee: employeesList) {
                if (employee == null) {
                    continue;
                }
                if (employee.getDepartment() == i) {
                    System.out.println(employee.getFirstName() + employee.getMiddleName() + employee.getLastName());
                }
            }
        }
    }
}

