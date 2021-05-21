package atmachine;

import java.util.Scanner;

public class AcctVerify {

    private static final Scanner input = new Scanner(System.in);
    private static String reply;

    public static String getReply() {
        return reply;
    }

    public static void acctVerify() {

        System.out.println("ENTER ACCOUNT NUMBER");
        reply = input.nextLine();
        switch (reply) {
            case "1":
                Transfer.trans(Transfer.acctName[0]);
                break;
            case "2":
                Transfer.trans(Transfer.acctName[1]);
                break;
            case "3":
                Transfer.trans(Transfer.acctName[2]);
                break;
            case "4":
                Transfer.trans(Transfer.acctName[3]);
                break;
            case "Exit":
                Repeat.persuade();
                break;
            default: {
                System.out.println("YOU HAVE NOT ENTERED A VALID ACCOUNT NUMBER");
                acctVerify();
                break;
            }
        }
    }
}
