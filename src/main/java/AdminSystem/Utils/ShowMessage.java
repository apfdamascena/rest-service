package AdminSystem.Utils;

public class ShowMessage {

    public static void welcome(){
        System.out.println("Bem vindo ao administrador de sistema");
    }

    public static void givePassword(){
        System.out.println("Insira sua senha: ");
    }
    public static void optionToChoose(){
        System.out.println("Escolha uma opçao");
        System.out.println("1 - Add product\n2 - Remove Product");
    }
}
