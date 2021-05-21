package atmachine;

import java.util.InputMismatchException;
import java.util.Scanner;

class Withdraw {
    private static final Scanner input = new Scanner(System.in);
    static int withdrawn;

    public static void cashOut() {
        int inputPin;
        int amt;


        inputPin = getPin();
        if (inputPin == UserInfo.acctPin) {
            System.out.println("YOU CURRENTLY HAVE N" + CheckBalance.getBal() + " IN YOUR ACCOUNT");
            amt = getAmt();
            if (CheckBalance.getBal() >= amt) {
                if (amt % 500 == 0) {
                    if (amt >= 500) {
                        CheckBalance.setBal(CheckBalance.getBal(), amt);
                        withdrawn += amt;
                        System.out.println("TRANSACTION SUCCESSFUL!");
                        System.out.println("YOUR REMAINING BALANCE IS N" + CheckBalance.getBal());
                    } else {
                        System.out.println("SORRY THE MINIMUM WITHDRAWAL AMOUNT IS N500");
                    }
                } else {
                    System.out.println("SORRY, CAN ONLY DISPENSE CASH IN MULTIPLES OF 500");
                }
            } else {
                System.out.println("INSUFFICIENT FUNDS");
            }
        } else {
            System.out.println("WRONG PIN");
        }
        Repeat.persuade();
    }

    private static int getAmt() {
        Scanner n = new Scanner(System.in);
        System.out.println("PLEASE ENTER THE AMOUNT YOU WANT TO WITHDRAW \n IN MULTIPLES OF 500");
        while (true) {
            try {
                return n.nextInt();
            } catch (InputMismatchException e) {
                n.nextLine();
                System.out.println("PLEASE ENTER A NUMERIC VALUE");
            }
        }
    }

    private static int getPin() {
        Scanner n = new Scanner(System.in);
        System.out.println("PLEASE ENTER YOUR PIN");
        while (true) {
            try {
                return n.nextInt();
            } catch (InputMismatchException e) {
                n.nextLine();
                System.out.println("PLEASE ENTER A NUMERIC VALUE");
            }
        }
    }

}
