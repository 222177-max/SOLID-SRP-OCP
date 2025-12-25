package openclose;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Object> employees = new ArrayList<>();

        employees.add(new EmployeeFullTime("Pepito Pérez", 160));
        employees.add(new EmployeePartTime("Manuel Lopera", 180));

        calculateSalaryMonthly(employees);
    }

    static void calculateSalaryMonthly(List<Object> employees) {

        for (Object employee : employees) {

            if (employee instanceof EmployeeFullTime) {

                double hourValue = 30000;
                EmployeeFullTime employeeFullTime = (EmployeeFullTime) employee;
                double salary = hourValue * employeeFullTime.getHoursWorked();

                System.out.printf(
                    "Empleado: %s, Pago: %.1f%n",
                    employeeFullTime.getFullname(),
                    salary
                );

            } else {

                double hourValue = 20000;
                EmployeePartTime employeePartTime = (EmployeePartTime) employee;
                double salary = hourValue * employeePartTime.getHoursWorked();

                if (employeePartTime.getHoursWorked() > 160) {
                    double effortCompensation = 5000;
                    int extraDays = employeePartTime.getHoursWorked() - 160;
                    salary += effortCompensation * extraDays;
                }

                System.out.printf(
                    "Empleado: %s, Pago: %.1f%n",
                    employeePartTime.getFullname(),
                    salary
                );
            }
        }
    }
}
