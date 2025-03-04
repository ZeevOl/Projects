import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    Message.showMessage("Enter amount of cash to initialize cash desk.");
    CashDesk CurrentCashDesk = new CashDesk(scan.nextDouble());
    Message.showMessage(CurrentCashDesk);
    Message.showMessage("Choose which action you want to do:\n" +
            "1)Add customer items to bill.\n" +
            "2)Show shopping basket.\n"+
            "3)End buy.");
   CurrentCashDesk.runCashProgram(scan);

    }


}