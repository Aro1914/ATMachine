package atmachine;

import static atmachine.CheckBalance.getBal;
import java.util.InputMismatchException;
import java.util.Scanner;

class Transfer {

    private static final Scanner response = new Scanner(System.in);
    static int[] acctNum = {0, 0, 0, 0};
    static String[] acctName = {
        "BAKE HANDYMAN",
        "MAKI NAKAMOTO",
        "ESTHER LI",
        "STOAT HENRY",};
    private static int tempAmt;

    public static void transfer() {
        System.out.println(
                "YOU CURRENTLY HAVE N" + CheckBalance.getBal() + " IN YOUR ACCOUNT"
        );
        tempAmt = getAmt();
        if (tempAmt <= getBal()) {
            AcctVerify.acctVerify();
        } else {
            System.out.println("INSUFFICIENT FUNDS");
            Repeat.persuade();
        }
    }

    private static int getAmt() {
        Scanner n = new Scanner(System.in);
        System.out.println("ENTER AMOUNT");
        while (true) {
            try {
                return n.nextInt();
            } catch (InputMismatchException e) {
                n.nextLine();
                System.out.println("PLEASE ENTER A NUMERIC VALUE");
            }
        }
    }

    public static void message() {
        int inputPin;
        System.out.println("PLEASE ENTER YOUR PIN");
        inputPin = response.nextInt();
        if (inputPin == UserInfo.acctPin) {
            CheckBalance.setBal(getBal(), tempAmt);
            switch (AcctVerify.getReply()) {
                case "1":
                    acctNum[0] += tempAmt;
                    break;
                case "2":
                    acctNum[1] += tempAmt;
                    break;
                case "3":
                    acctNum[2] += tempAmt;
                    break;
                case "4":
                    acctNum[3] += tempAmt;
                    break;
                default:
                    break;
            }
            System.out.println("TRANSACTION SUCCESSFUL!");
            System.out.println("YOUR NEW ACCOUNT BALANCE IS N" + CheckBalance.getBal());
        } else {
            System.out.println("WRONG PIN");
        }
        Repeat.persuade();
    }

    public static void trans(String name) {
        String reply;
        System.out.println(
                "DO YOU WANT TO TRANSFER N" + tempAmt + " TO " + name + "?\n1. YES\n2. NO"
        );
        reply = response.nextLine();
        switch (reply) {
            case "1":
                Transfer.message();
                break;
            case "2":
                Repeat.persuade();
                break;
            case "Exit":
                Repeat.persuade();
                break;
            default:
                System.out.println("YOU DID NOT ENTER A VALID OPTION");
                Repeat.persuade();
                break;
        }
    }
}
