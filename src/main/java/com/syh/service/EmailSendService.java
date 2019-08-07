package main.java.com.syh.service;

import main.java.com.syh.entity.Employee;

import java.util.List;

public class EmailSendService {
    public void send(List<Employee> employeeList) {
        employeeList.stream().forEach((item) -> {
            System.out.println("dear"+" "+ item.getFirstName()+item.getLastName() + ":");
            System.out.println("today is your birthday.");
            System.out.println("happy birthday to you!");
        });
    }
}
