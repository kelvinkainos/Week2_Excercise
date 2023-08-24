package org.kainos.ea.client;

public class FailedtoCreateEmployee extends Throwable {

    @Override
    public String getMessage()
    {
        return "Failed to get all employees from database";
    }
}
