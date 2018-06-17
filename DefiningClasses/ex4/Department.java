package ex4;

import java.util.LinkedList;
import java.util.List;

public class Department {
    private String departmentName;
    private List<Employee> employees;
    private Double averageSalary;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new LinkedList<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Employee employee) {

        this.employees.add(employee);

        Double salarySum = 0.0;

        for (Employee employee1 : employees) {
            salarySum = salarySum + employee1.getSalary();
        }

        this.averageSalary = salarySum/employees.size();
    }

    public Double getAverageSalary() {
        return averageSalary;
    }

}
