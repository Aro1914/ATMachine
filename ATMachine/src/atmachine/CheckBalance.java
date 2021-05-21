package atmachine;

import java.util.Random;

class CheckBalance {
    private static final Random luckyNum = new Random();
    private static int bal = 50000 + luckyNum.nextInt(50000);

    public static int getBal() {
        return bal;
    }

    public static void setBal(int bal, int amt) {
        CheckBalance.bal = bal - amt;
    }

    public static void viewBal() {
        System.out.println("ACCOUNT NAME\t" + "\tBALANCE");
        System.out.println(UserInfo.acctName + "\t " + "N" + bal);
        Repeat.persuade();
    }
}
