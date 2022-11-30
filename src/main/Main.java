package main;

import bean.Config;
import utill.MenuUtil;

public class Main {
    public static void main(String[] args) throws Exception {
        Config.initialize();

        MenuUtil.showMenu();


    }



}
