package service;

import bean.Config;
import bean.Teacher;
import service.inter.MenuShowTeacherServiceInter;

public class MenuShowTeacherService implements MenuShowTeacherServiceInter {
    @Override
    public void processLogic() {

        Teacher[] allTeacher= Config.instance().getTeacher();
        for (int i = 0; i <allTeacher.length ; i++) {
            System.out.println(allTeacher[i]);

        }
    }
}
