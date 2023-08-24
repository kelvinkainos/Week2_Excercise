package org.kainos.ea.resources;

import io.swagger.annotations.Api;
import org.kainos.ea.cli.Employee;
import org.kainos.ea.client.FailedtoCreateEmployee;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Api("Evian Week 2 Exercise Employees API")
@Path("/api")
public class EmployeeController {
        private Employee employeeService = new EmployeeService();

        @GET
        @Path("/employees")
        @Produces(MediaType.APPLICATION_JSON)
        public List<Employee> getEmployees() {
            return employeeService.getAllEmployees();

        }
     }

