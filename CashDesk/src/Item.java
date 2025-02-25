public class Item {
    Item(String name , double cost){
        setItemName(name);
        setItemCost(cost);
    }
    Item(Item item){
        _ItemName = item.getItemName();
        _ItemCost = item.getItemCost();
    }
    private String _ItemName;
    private double _ItemCost;

    public void setItemName(String name){
        _ItemName = name;
    }
    public void setItemCost(double cost){
        _ItemCost = cost;
    }
    public String getItemName(){return _ItemName;}
    public double getItemCost(){return _ItemCost;}
}
