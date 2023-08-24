package org.kainos.ea.api;

import org.kainos.ea.cli.EmployeeRequest;
import org.kainos.ea.db.EmployeeDao;

import java.sql.SQLException;

public class EmployeeService {
    private EmployeeDao employeeDao = new EmployeeDao();

    public void deleteEmployee(int id) throws EmployeeDoesNoteExistException, FailedToDeleteProductException{
        try {
            Product productToDelete = productDao.getProductsById(id);

            if(productToDelete == null){
                throw new ProductDoesNoteExistException();
            }

            productDao.deleteProduct(id);
        }catch (SQLException e){
            System.err.println(e.getMessage());
            throw new FailedToDeleteProductException();
        }
    }




}
