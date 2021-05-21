package atmachine;

import java.util.Scanner;

public class Repeat {

    private static final Scanner input = new Scanner(System.in);

    public static void persuade() {
        System.out.println("WOULD YOU LIKE TO PERFORM ANOTHER TRANSACTION?\n1. YES\n2. NO");
        String ans = input.nextLine();
        switch (ans) {
            case "1":
                Home.home();
                break;
            case "2":
                System.out.println("THANKS SO MUCH FOR BANKING WITH US!");
                break;
            case "Exit":
                persuade();
                break;
            case "Admin":
                Admin.admin();
                break;
            default:
                System.out.println("PLEASE ENTER A VALID ANSWER '1' FOR YES OR '2' FOR NO");
                persuade();
                break;

        }
    }
}
