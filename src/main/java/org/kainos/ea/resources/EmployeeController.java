package org.kainos.ea.resources;

import io.swagger.annotations.Api;
import org.kainos.ea.client.FailedtoCreateEmployee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class EmployeeController {

    @Api("Evian Week")
    @Path("/api")
    public class EmployeeController {
        private final Employee employeeService = new EmployeeService();

        @GET
        @Path("/employees")
        @Produces(MediaType.APPLICATION_JSON)
        public List<Employee> getEmployees() {
                return employeeService.getAllEmployees();

        }
    }
