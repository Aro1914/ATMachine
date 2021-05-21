package atmachine;

import java.util.Scanner;

public class Home {

    private static final Scanner input = new Scanner(System.in);

    public static void home() {
        System.out.println("WHAT WOULD YOU LIKE TO DO?\n1. VIEW BALANCE\n2. TRANSFER\n3. WITHDRAW");
        String ans = input.nextLine();
        switch (ans) {
            case "1":
                CheckBalance.viewBal();
                break;
            case "2":
                Transfer.transfer();
                break;
            case "3":
                Withdraw.cashOut();
                break;
            case "Exit":
                Repeat.persuade();
                break;
            default:
                System.out.println("PLEASE ENTER A VALID OPTION!");
                home();
                break;

        }
    }
}
