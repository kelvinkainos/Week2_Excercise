package org.kainos.ea.api;

import org.kainos.ea.cli.DeliveryEmployeeRequest;
import org.kainos.ea.client.FailedToCreateDeliveryEmployeeException;
import org.kainos.ea.db.DeliveryEmployeeDao;

import java.sql.SQLException;

public class DeliveryEmployeeService {
    private DeliveryEmployeeDao deliveryEmployeeDao = new DeliveryEmployeeDao();

    public int createDeliveryEmployee(DeliveryEmployeeRequest deliveryEmployee) throws FailedToCreateDeliveryEmployeeException {
        try {
            int id = deliveryEmployeeDao.createEmployee(deliveryEmployee);

            if (id == -1)
                throw new FailedToCreateDeliveryEmployeeException();

            return id;
        } catch (SQLException e) {
            System.err.println(e.getMessage());

            throw new FailedToCreateDeliveryEmployeeException();
        }
    }
}
