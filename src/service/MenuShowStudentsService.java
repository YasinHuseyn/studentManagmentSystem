package service;

import bean.Config;
import bean.Student;
import service.inter.MenuShowStudentsServiceInter;

public class MenuShowStudentsService implements MenuShowStudentsServiceInter {
    @Override
    public void processLogic() {
        Student[] allStudent= Config.instance().getStudent();
        for (int i = 0; i <allStudent.length ; i++) {
            System.out.println(allStudent[i]);

        }

    }
}
