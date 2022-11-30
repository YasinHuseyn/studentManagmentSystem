package service;

import bean.Config;
import bean.Student;
import bean.Teacher;
import service.inter.MenuAddTeacherServiceInter;
import utill.FileUtility;

import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter {
    @Override
    public void processLogic() {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Teacher name: ");
        String teacherName  =scanner.nextLine();

        Scanner scanner1=new Scanner(System.in);
        System.out.println("Enter teacher schoolName: ");
        String schoolName=scanner1.nextLine();

        Teacher t=new Teacher();
        t.setName(teacherName);
        t.setSchoolName(schoolName);

        Config.instance().appendTeacher(t);


    }
}

