package main.java.com.syh.service;

import main.java.com.syh.entity.Employee;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class AnalyseDataService {
    public List<Employee> analyse(List<Employee> employeeList) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd");
        String dateString = simpleDateFormat.format(date);
        return employeeList.stream().filter(item ->
           dateString.equals(item.getBirthday().substring(5,item.getBirthday().length()))
        ).collect(Collectors.toList());
    }
}
