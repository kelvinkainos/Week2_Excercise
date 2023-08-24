package org.kainos.ea.client;

public class EmployeeDoesNotExistException extends Throwable{
    @Override
    public String getMessage(){
        return "Employee not exist Employee in Database";
    }
}
