package main.java.com.syh.service;

import main.java.com.syh.entity.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileReadService {

    public List<Employee> readFile(String filePath) {
        List<Employee> employeeList = new ArrayList<>();
        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                String[] employeeArray = line.split(",");
                Employee employee = new Employee();
                employee.setLastName(employeeArray[0]);
                employee.setFirstName(employeeArray[1]);
                employee.setBirthday(employeeArray[2]);
                employee.setEmail(employeeArray[3]);
                employeeList.add(employee);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return employeeList;
    }


}
