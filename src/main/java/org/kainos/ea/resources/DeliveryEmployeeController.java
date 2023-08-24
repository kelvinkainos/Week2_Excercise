package org.kainos.ea.resources;

import io.swagger.annotations.Api;
import org.kainos.ea.cli.DeliveryEmployee;
import org.kainos.ea.cli.DeliveryEmployeeRequest;
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
@Path("/api/employees")
public class DeliveryEmployeeController {

    private DeliveryEmployeeService deliveryEmployeeService = new DeliveryEmployeeService();
    @GET
    @Path("/delivery")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> getEmployees() {
        return deliveryEmployeeService.getAllDeliveryEmployees();
    }
    @POST
    @Path("/delivery")
    @Produces(MediaType.APPLICATION_JSON)
    public Response createProject(DeliveryEmployeeRequest deliveryEmployee) {
        return deliveryEmployeeService.createEmployee(deliveryEmployee);
    }
}
