package org.kainos.ea.api;

import org.kainos.ea.cli.DeliveryEmployee;
import org.kainos.ea.cli.Employee;
import org.kainos.ea.cli.EmployeeRequest;
import org.kainos.ea.client.EmployeeDoesNotExistException;
import org.kainos.ea.client.FailedToDeleteEmployeeException;
import org.kainos.ea.client.FailedToGetEmployeeException;
import org.kainos.ea.db.EmployeeDao;

import java.sql.SQLException;
import java.util.List;

public class EmployeeService {
    private EmployeeDao employeeDao = new EmployeeDao();

    public void deleteEmployee(int id) throws FailedToDeleteEmployeeException {
        try {
            employeeDao.deleteEmployee(id);
        }catch (SQLException e){
            System.err.println(e.getMessage());
            throw new FailedToDeleteEmployeeException();
        }
    }

    public List<Employee> getEmployees() throws FailedToGetEmployeeException {
        List<Employee> employeeList = null;
        try {
            employeeList = employeeDao.getEmployees();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return employeeList;
    }




}
