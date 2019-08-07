package main.java.com.syh;

import main.java.com.syh.entity.Employee;
import main.java.com.syh.service.AnalyseDataService;
import main.java.com.syh.service.EmailSendService;
import main.java.com.syh.service.FileReadService;

import java.util.List;

public class Application {
    static String filePath = "/Users/yihaosun/IdeaProjects/birthdayGreeting/src/main/resource/employeeInfo.txt";

    public static void main(String[] args) {
        FileReadService fileReadService = new FileReadService();
        AnalyseDataService analyseDataService = new AnalyseDataService();
        EmailSendService emailSendService = new EmailSendService();

        List<Employee> employees= fileReadService.readFile(filePath);
        List<Employee> employeeList = analyseDataService.analyse(employees);
        emailSendService.send(employeeList);

    }
}
