package org.kainos.ea.client;

public class FailedToUpdateEmployeeException extends Exception {

    @Override
    public String getMessage(){
        return "Failed update product in the database";
    }
}
