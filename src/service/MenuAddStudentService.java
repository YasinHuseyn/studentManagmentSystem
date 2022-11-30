package service;

import bean.Config;
import bean.Student;
import service.inter.MenuAddStudentServiceInter;

import java.util.Scanner;

public class MenuAddStudentService implements MenuAddStudentServiceInter {
    @Override
    public void processLogic()  {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter student name: ");
        String studentName =scanner.nextLine();

        Scanner scanner1=new Scanner(System.in);
        System.out.println("Enter schoolName: ");
        String schoolName=scanner1.nextLine();

        Student s=new Student();
        s.setName(studentName);
        s.setSchoolName(schoolName);

        Config.instance().appendStudent(s);




    }
}
