package org.kainos.ea.api;

import org.kainos.ea.cli.EmployeeRequest;
import org.kainos.ea.client.EmployeeDoesNotExistException;
import org.kainos.ea.client.FailedToDeleteEmployeeException;
import org.kainos.ea.db.EmployeeDao;

import java.sql.SQLException;

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




}
