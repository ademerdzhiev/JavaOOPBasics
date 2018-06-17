package ex4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Department> departments = new HashMap<>();

        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = bufferedReader.readLine().split("\\s+");

            String name = input[0];
            Double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String depatmentName = input[3];

            Employee employeeBase = new Employee(name, salary, position, depatmentName);

            if (input.length == 5) {
                if(isNumeric(input[4])) {
                   employeeBase.setAge(Integer.valueOf(input[4]));
                } else {
                    employeeBase.setEmail(input[4]);
                }
            }

            if (input.length == 6) {
                employeeBase.setEmail(input[4]);
                employeeBase.setAge(Integer.valueOf(input[5]));
            }

            Department department = new Department(depatmentName);
            departments.putIfAbsent(depatmentName, department);
            departments.get(depatmentName).setEmployees(employeeBase);
        }

        departments.entrySet().stream()
                .sorted((dep1, dep2) -> dep2.getValue().getAverageSalary().compareTo(dep1.getValue().getAverageSalary()))
                .limit(1).forEach(d -> {
                    System.out.println("Highest Average Salary: " + d.getValue().getDepartmentName());
                    d.getValue().getEmployees()
                            .stream().sorted((per1, per2) -> per2.getSalary().compareTo(per1.getSalary()))
                            .forEach(person -> {
                                System.out.printf("%s %.2f %s %d", person.getName(), person.getSalary(),
                                        person.getEmail(), person.getAge());
                                System.out.println();
                            });
                });
    }

    public static boolean isNumeric(String text) {
        try {
         Integer i = Integer.parseInt(text);
        } catch (NumberFormatException nfe) {
            return false;
        }

        return true;
    }
}
