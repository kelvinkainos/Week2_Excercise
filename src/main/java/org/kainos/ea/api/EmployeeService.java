package org.kainos.ea.api;
;
import org.kainos.ea.cli.EmployeeRequest;
import org.kainos.ea.client.FailedToUpdateEmployeeException;
import org.kainos.ea.db.EmployeeDao;

import java.sql.SQLException;

public class EmployeeService {
    private EmployeeDao employeeDao = new EmployeeDao();

  


  
  
  
  
  
  
  
  
  
  
  
  >>>>>>> main
  <<<<<<< US0007-DeliveryService
    public void updateEmployee(int id, EmployeeRequest Employee) throws FailedToUpdateEmployeeException {
        try{
            employeeDao.UpdateEmployee(id,Employee);
        }
        catch (SQLException e)
        {
            System.err.println(e.getMessage());

            throw new FailedToUpdateEmployeeException();
        }
    }
=======
}
