package service;

import bean.Config;
import service.inter.MenuLoginServiceInter;

import java.util.Scanner;

public class MenuLoginService implements MenuLoginServiceInter {


    @Override
    public void processLogic() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter user name :");
        String User=scanner.nextLine();

        Scanner scanner1=new Scanner(System.in);
        System.out.println("Enter password :");
        String password=scanner1.nextLine();

        if(!(User.equals("Yasin") && password.equals("232306"))){
            throw new IllegalArgumentException("User or password is invalid ");
        }
        else  {
            System.out.println("successfully logged");
        }
        Config.setLoggedIn(true);


    }
}
