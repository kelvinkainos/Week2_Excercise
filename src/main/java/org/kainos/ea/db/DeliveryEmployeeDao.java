package org.kainos.ea.db;

import org.kainos.ea.cli.EmployeeRequest;

import java.sql.*;

public class DeliveryEmployeeDao extends EmployeeDao {

    private final DatabaseConnector databaseConnector = new DatabaseConnector();

    @Override
    public int createEmployee(EmployeeRequest employee) throws SQLException {

        Connection c = databaseConnector.getConnection();

        int employeeId = super.createEmployee(employee);

        if(employeeId == -1)
        {
            return -1;
        }

        String insertStatement = "INSERT INTO DeliverEmployee (EmployeeId) VALUES (?);";

        PreparedStatement st = c.prepareStatement(insertStatement, Statement.RETURN_GENERATED_KEYS);

        st.setInt(1, employeeId );

        st.executeUpdate();
        ResultSet rs = st.getGeneratedKeys();

        if(rs.next())
            return rs.getInt(1);

        return -1;

    }
}
