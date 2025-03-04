public class Tester {
    public static void main(String [] args){
        System.out.println("--------------------------TESTER----------------------------");
        CashDesk testCashDesk = new CashDesk(500.0);
        System.out.println(testCashDesk);
        testCashDesk.addToBill(new Item("Coca Cola",12),2);
        testCashDesk.addToBill(new Item("Red meat",50),2);
        testCashDesk.currentBill();
        System.out.println("Total cost:"+testCashDesk.totalSum());
        testCashDesk.showChange(200.0);
        System.out.println(testCashDesk);
        System.out.println("--------------------------END OF TESTER---------------------");
    }
}
