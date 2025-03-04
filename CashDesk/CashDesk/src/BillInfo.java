public class BillInfo {
    BillInfo(Item item , int amount , double totalCost){
        Item ItemToAdd = new Item(item);
        _Item = ItemToAdd;
        _Amount = amount;
        _TotalCost = totalCost;
    }
    private Item _Item;
    private int _Amount;
    private double _TotalCost; // total cost = (Amount * Cost)

    public Item getItem(){
        return _Item;
    }
    public int getAmount(){
        return _Amount;
    }
    public double getTotalCost(){
        return _TotalCost;
    }
}
