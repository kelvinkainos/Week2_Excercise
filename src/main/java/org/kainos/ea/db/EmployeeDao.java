package org.kainos.ea.db;

import org.kainos.ea.cli.Employee;
import org.kainos.ea.cli.EmployeeRequest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public void deleteEmployee(int id) throws SQLException {
        Connection c = databaseConnector.getConnection();

        String deleteStatement = "DELETE FROM DeliveryEmployee WHERE ProductID = ?";

        PreparedStatement st = c.prepareStatement(deleteStatement);

        st.setInt(1, id);

        st.executeUpdate();

    }

    public List<Employee> getEmployees() throws SQLException {
        try(Connection c = databaseConnector.getConnection()){
            Statement st = c.createStatement();

            ResultSet rs = st.executeQuery("SELECT EmployeeID, Name, Salary, Bank_Acc_Number, NI_Number FROM `Employee`;");

            List<Employee> employeeList = new ArrayList<>();

            while (rs.next()){
                Employee em = new Employee(
                        rs.getInt("EmployeeID"),
                        rs.getString("Name"),
                        rs.getDouble("Salary"),
                        rs.getString("Bank_Acc_Number"),
                        rs.getString("NI_Number")
                );

                employeeList.add(em);
            }
            return employeeList;

        }catch (SQLException e){
            System.err.println(e.getMessage());
            return null;
        }

    }
}
