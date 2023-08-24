package org.kainos.ea.client;

public class EmployeeDoesNotExistException extends Throwable{
    @Override
    public String getMessage(){
        return "Delete Delivery Does not exist Employee in Database";
    }
}
