package utill;

import java.util.Scanner;

public class MenuUtil {
    public static void showMenu(){
        System.out.println("Please select Menu");
        Menu.showAllMenu();

        Scanner sc =new Scanner(System.in);

        int selectedMenuNumber =sc.nextInt();

Menu selectedMenu =Menu.find(selectedMenuNumber);
        selectedMenu.process();

    }
    public static void proccesMenu(Menu menu){

        menu.process();
    }
}
