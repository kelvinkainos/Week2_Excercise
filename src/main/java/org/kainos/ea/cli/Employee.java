package org.kainos.ea.cli;

public class Employee {
    private int employeeId;
    private String name;
    private double salary;
    private String bankAccNum;
    private String nationalInsuranceNum;

    public Employee(int employeeId, String name, double salary, String bankAccNum, String nationalInsuranceNum) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.bankAccNum = bankAccNum;
        this.nationalInsuranceNum = nationalInsuranceNum;
    }
}
