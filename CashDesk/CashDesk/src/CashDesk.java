import java.util.ArrayList;
import java.util.Scanner;

public class CashDesk {
    final  static int ADD_TO_BILL = 1;
    final static int SHOW_SHOPPING_BASKET =2;
    final static int END_BUY=3;
    private ArrayList<BillInfo>bill = new ArrayList<>();
    private double _CashAmountInCashDesk;

    CashDesk(){}
    CashDesk(double InitiateCashAmount){
        if(InitiateCashAmount>=0)_CashAmountInCashDesk = InitiateCashAmount;
    }
    public String toString(){
        String message = "Cash amount:" + getCashAmountInCashDesk() + "\n"
                + "-----------";
        return message;
    }

    public double getCashAmountInCashDesk(){
        return _CashAmountInCashDesk;
    }

    public void setCashAmountInCashDesk(double cash){
        _CashAmountInCashDesk = cash;
    }

    public void addToBill(Item item , int amount){
        Item ItemCopy = new Item(item);
         bill.add(new BillInfo(ItemCopy , amount ,ItemCopy.getItemCost()*amount));
         return;

    }

    public void currentBill(){
        for(BillInfo info : bill){
            System.out.println("item name:" + info.getItem().getItemName()+ " "+
                    "amount:" + info.getAmount() + " " + "total cost:" + info.getTotalCost());
        }
    }

    public double totalSum (){
        double TotalSum = 0;
        for(BillInfo ItemCost : bill){
            TotalSum+=ItemCost.getTotalCost();
        }
        return TotalSum;

    }

    public void showChange(double cashAmount){
        double Change = 0;
        Change = cashAmount-totalSum();
        System.out.println("Change:"+Change);
        bill.clear();//reset bill for current customer
        setCashAmountInCashDesk(getCashAmountInCashDesk()-Change);


    }

    public void runCashProgram(Scanner scan){
        int UserChoice = scan.nextInt();
        boolean RunFlag = true;
        while(RunFlag) {
            switch (UserChoice) {
                case ADD_TO_BILL:
                    Message.showMessage("Enter item name , cost and amount:");
                    addToBill(new Item(scan.next(),scan.nextDouble()),scan.nextInt());
                    Message.showMessage("Choose action.");
                    runCashProgram(scan);
                    break;
                case SHOW_SHOPPING_BASKET:
                    currentBill();
                    Message.showMessage("Choose action.");
                    runCashProgram(scan);
                    break;
                case END_BUY:
                    Message.showMessage("Enter amount of money received by customer:");
                    showChange(scan.nextDouble());


                    break;
                default:
                    Message.showMessage("Not a recognized action.\n");
                    Message.showMessage("Choose action.");
                    runCashProgram(scan);



            }
            return;
        }
    }





}
