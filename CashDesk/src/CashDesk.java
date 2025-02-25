import java.util.ArrayList;
public class CashDesk {
    private ArrayList<BillInfo>bill = new ArrayList<>();
    private double _CashAmountInCashDesk;

    CashDesk(){}
    CashDesk(double InitiateCashAmount){
        if(InitiateCashAmount>=0)_CashAmountInCashDesk = InitiateCashAmount;
    }
    public String toString(){
        String message = "Cash amount:" + _CashAmountInCashDesk + "\n"
                + "-----------";
        return message;
    }

    public void addToBill(Item item , int amount){
        Item itemCopy = new Item(item);
         bill.add(new BillInfo(itemCopy , amount ,(itemCopy.getItemCost()*amount)));
         return;

    }

    public void currentBill(){
        System.out.println(bill.size());
        for(BillInfo info : bill){
            System.out.println("item name:" + info.getItem().getItemName()+ " "+
                    "amount:" + info.getAmount() + " " + "total cost:" + info.getTotalCost());
        }
    }
}
