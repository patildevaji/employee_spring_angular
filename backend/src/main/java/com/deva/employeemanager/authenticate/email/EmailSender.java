package com.deva.employeemanager.authenticate.email;

public interface EmailSender {
    void send(String to, String subject);
}
