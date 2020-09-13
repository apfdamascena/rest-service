package AdminSystem.System;
import AdminSystem.Admin.Admin;
import AdminSystem.Utils.ShowMessage;
import com.rest.service.restservice.Utils.Constants;

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
        menu();
    }

    private static void checkPasswordToAccess(int givenPassword ){ admin = new Admin(givenPassword);}

    private static void menu(){
        if(admin.isAutenticado()){
            ShowMessage.optionToChoose();
            int optionChosen = Integer.parseInt(keyboard.nextLine());
            whatDoIHaveToDo(optionChosen);
        }
    }

    private static void whatDoIHaveToDo(int optionChosen){
        if(optionChosen == Constants.ZERO.value()) tryToAddProduct();
        if(optionChosen == Constants.ONE.value()) tryToRemoveProduct();
    }

    private


}
