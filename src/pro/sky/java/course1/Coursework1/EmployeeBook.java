package pro.sky.java.course1.Coursework1;

public class EmployeeBook {
    private static final Employee[] employeesList = new Employee[10];


    public void printEmployeeList() {
        for (Employee employee : employeesList) {
            if (employee != null) {
                employee.toString();
            }
        }
    }

    public double calculateTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employeesList) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public Employee findMinimalSalary() {
        double minimalSalary = Double.MAX_VALUE;
        int salaryId = 0;
        for (Employee employee : employeesList) {
            if (employee != null && employee.getSalary() < minimalSalary) {
                minimalSalary = employee.getSalary();
                salaryId = employee.getId();
            }
        }
        return employeesList[salaryId];
    }

    public Employee findMaximalSalary() {
        double maximalSalary = Double.MIN_VALUE;
        int salaryId = 0;
        for (Employee employee : employeesList) {
            if (employee != null && employee.getSalary() > maximalSalary) {
                maximalSalary = employee.getSalary();
                salaryId = employee.getId();
            }
        }
        return employeesList[salaryId];
    }

    public double calculateAverageSalary() {
        double avgSalary = 0;
        int listLength = employeesList.length;
        for (Employee employee : employeesList) {
            if (employee == null) {
                listLength -= 1;
                avgSalary = calculateTotalSalary() / listLength;
            }
        }
        return avgSalary;
    }

    public void printEmployees() {
        for (Employee employee : employeesList) {
            if (employee != null) {
                System.out.print(employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getLastName() + "\n");
            }
        }
    }


    public void indexSalary(double percent) {
        for (Employee employee : employeesList) {
            if (employee != null) {
                double salaryAfterIndexing = (employee.getSalary() * percent) / 100;
                if (employee != null) {
                    employee.setSalary(employee.getSalary() + salaryAfterIndexing);
                    return;
                }
            }
        }
        System.out.println("Не удалось изменить зарплату");
    }

    public Employee findDepartmentMinSalary(int department) {
        double minimalSalary = Double.MAX_VALUE;
        int salaryId = 0;
        for (Employee employee : employeesList) {
            if (employee != null && employee.getDepartment() == department) {
                if (employee.getSalary() < minimalSalary) {
                    minimalSalary = employee.getSalary();
                    salaryId = employee.getId();
                }
            }
        }
        return employeesList[salaryId];
    }

    public Employee findDepartmentMaxSalary(int department) {
        double maximumSalary = Double.MIN_VALUE;
        int salaryId = 0;
        for (Employee employee : employeesList) {
            if (employee != null && employee.getDepartment() == department) {
                if (employee.getSalary() > maximumSalary) {
                    maximumSalary = employee.getSalary();
                    salaryId = employee.getId();
                }
            }
        }
        return employeesList[salaryId];
    }

    public double calculateAverageDepartmentSalary(int department) {
        int departmentCount = 0;
        double totalDepartmentSalary = 0;
        for (Employee employee : employeesList) {
            if (employee != null && employee.getDepartment() == department) {
                totalDepartmentSalary += employee.getSalary();
                departmentCount++;
            }
        }
        return totalDepartmentSalary / departmentCount;
    }

    public void indexDepartmentSalary(int department, double percent) {
        for (Employee employee : employeesList) {
            if (employee != null) {
                double salaryAfterIndexing = employee.getSalary() * percent / 100;
                if (employee != null && employee.getDepartment() == department) {
                    employee.setSalary(employee.getSalary() + salaryAfterIndexing);
                }
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

    public void findEmployeesThatHaveSalaryLessThan(int salary) {
        for (Employee employee : employeesList) {
            if (employee != null) {
                if (employee.getSalary() < salary) {
                    employee.toString();
                }
            }
        }
        System.out.println("===============================================");
    }

    public void findEmployeesThatHaveSalaryMoreThan(int salary) {
        for (Employee employee : employeesList) {
            if (employee != null) {
                if (employee.getSalary() >= salary) {
                    employee.toString();
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
            }
        }
        System.out.println("Не удалось удалить сотрудника!");
    }

    public void editEmployeeSalary(String firstName, String secondName, String lastName, double salary) {
        System.out.println("\n");
        for (Employee employee : employeesList) {
            if (employee != null) {
                if (firstName.equals(employee.getFirstName()) && secondName.equals(employee.getMiddleName()) && lastName.equals(employee.getLastName())) {
                    employee.setSalary(salary);
                    System.out.println("Новая зарплата сотрудника " + employee.getSalary());
                    return;
                }
            }
        }
        System.out.println("Не удалось изменить зарплату");
    }

    public void editEmployeeDepartment(String firstName, String secondName, String lastName, int department) {
        System.out.println("\n");
        for (Employee employee : employeesList) {
            if (employee != null) {
                if (firstName.equals(employee.getFirstName()) && secondName.equals(employee.getMiddleName()) && lastName.equals(employee.getLastName())) {
                    employee.setDepartment(department);
                    System.out.println("Отдел сотрудника изменен на " + employee.getDepartment());
                    return;
                }
            }
        }
        System.out.println("Не удалось изменить отдел");
    }

    public void printEmployeesInDepartment() {
        System.out.println("\n");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Отдел" + i + ". Работники: ");
            for (Employee employee : employeesList) {
                if (employee == null) {
                    continue;
                }
                if (employee.getDepartment() == i) {
                    System.out.println(employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getLastName());
                }
            }
        }
    }
}

