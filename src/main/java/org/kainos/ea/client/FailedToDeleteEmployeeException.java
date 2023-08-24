package org.kainos.ea.client;

public class FailedToDeleteEmployeeException extends Throwable{
    @Override
    public String getMessage(){
        return "Failed to Delete Order in Database";
    }
}