package org.kainos.ea.client;

public class EmployeeDoesNotExistException extends Throwable {
    @Override
    public String getMessage(){
        return "Failed to get product from the database";
    }
}
