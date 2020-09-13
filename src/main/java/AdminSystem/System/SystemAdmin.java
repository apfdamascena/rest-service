package AdminSystem.System;
import AdminSystem.Admin.Admin;
import AdminSystem.Utils.ShowMessage;

import java.util.Scanner;

public class SystemAdmin {

    private static Admin admin;
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args){
        adminSystem();
    }

    private static void adminSystem(){
        ShowMessage.welcome();
        ShowMessage.givePassword();
        int password = keyboard.nextInt();
        checkPasswordToAccess(password);
    }

    private static void checkPasswordToAccess(int givenPassword ){
        admin = new Admin(givenPassword);
    }
}
