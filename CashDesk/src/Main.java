
public class Main {
    public static void main(String[] args) {
        CashDesk testCashDesk = new CashDesk(500.0);
        testCashDesk.addToBill(new Item("Coca Cola",12),2);
        testCashDesk.addToBill(new Item("red meat",50),2);
        testCashDesk.currentBill();



    }
}