package atmachine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Admin {

    public static final int ADM = 1359;

    public static void admin() {
        int ans;
        ans = getId();
        if (ans == ADM) {
            System.out.println(
                    "ACCOUNTS\t\tBALANCES\n1. "
                    + UserInfo.fName
                    + " "
                    + UserInfo.lName
                    + "\t "
                    + "N"
                    + CheckBalance.getBal()
                    + "\n2. "
                    + Transfer.acctName[0]
                    + "\t"
                    + " N"
                    + Transfer.acctNum[0]
                    + "\n3. "
                    + Transfer.acctName[1]
                    + "\t "
                    + "N"
                    + Transfer.acctNum[1]
                    + "\n4. "
                    + Transfer.acctName[2]
                    + "\t"
                    + "\t "
                    + "N"
                    + Transfer.acctNum[2]
                    + "\n5. "
                    + Transfer.acctName[3]
                    + "\t"
                    + "\t "
                    + "N"
                    + Transfer.acctNum[3]
            );
            if (Withdraw.withdrawn != 0) {
                System.out.println("DURING THIS SESSION YOU WITHDREW A TOTAL OF N" + Withdraw.withdrawn);
            } else {
                System.out.println("YOU DID NOT MAKE ANY WITHDRAWAL DURING THIS SESSION");
            }
            Repeat.persuade();
        } else {
            System.out.println("YOU ARE NOT A VALID USER");
            Repeat.persuade();
        }
    }

    private static int getId() {
        Scanner n = new Scanner(System.in);
        System.out.println(
                "YOU HAVE JUST ENTERED A RESTRICTED ZONE\n ENTER ADMIN ID TO PROCEED"
        );
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
