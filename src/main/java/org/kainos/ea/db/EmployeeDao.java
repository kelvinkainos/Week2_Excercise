package org.kainos.ea.db;

import org.kainos.ea.cli.EmployeeRequest;

import java.sql.*;

public class EmployeeDao {
    private final DatabaseConnector databaseConnector = new DatabaseConnector();

    public int createEmployee(EmployeeRequest employee) throws SQLException {
        Connection c = databaseConnector.getConnection();

        String insertStatement = "INSERT INTO Employee (Name, Salary, Bank_Acc_Number, NI_Number) VALUES (?,?,?,?);";

        PreparedStatement st = c.prepareStatement(insertStatement, Statement.RETURN_GENERATED_KEYS);

        st.setString(1, employee.getName());
        st.setDouble(2, employee.getSalary());
        st.setString(3, employee.getBankAccNum());
        st.setString(4, employee.getNationalInsuranceNum());

        st.executeUpdate();
        ResultSet rs = st.getGeneratedKeys();

        if(rs.next())
            return rs.getInt(1);

        return -1;
    }

    public void UpdateEmployee(int id, EmployeeRequest employee) throws SQLException{
        Connection c = databaseConnector.getConnection();

        String updateStatement = "UPDATE Employee SET Name = ?, Salary = ?, Bank_Acc_Number = ?, NI_Number = ? WHERE EmployeeID = ?";

        PreparedStatement st = c.prepareStatement(updateStatement);

        st.setString(1, employee.getName());
        st.setDouble(2, employee.getSalary());
        st.setString(3, employee.getBankAccNum());
        st.setString(4, employee.getNationalInsuranceNum());
        st.setInt(5,id);

        st.executeUpdate();

    }

}
