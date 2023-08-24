package org.kainos.ea.cli;

public class EmployeeRequest {
    private String name;
    private double salary;
    private String bankAccNum;
    private String nationalInsuranceNum;

    public EmployeeRequest(String name, double salary, String bankAccNum, String nationalInsuranceNum) {
        this.name = name;
        this.salary = salary;
        this.bankAccNum = bankAccNum;
        this.nationalInsuranceNum = nationalInsuranceNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getBankAccNum() {
        return bankAccNum;
    }

    public void setBankAccNum(String bankAccNum) {
        this.bankAccNum = bankAccNum;
    }

    public String getNationalInsuranceNum() {
        return nationalInsuranceNum;
    }

    public void setNationalInsuranceNum(String nationalInsuranceNum) {
        this.nationalInsuranceNum = nationalInsuranceNum;
    }
}
