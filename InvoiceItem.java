public class InvoiceItem {
    private String id;
    private String desc;
    private double unitPrice;
    private int qty;
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.unitPrice = unitPrice;
    }
    public String getId(){
        return id;
    }
    public String getDesc(){
        return desc;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }
    public double getTotal(){
        return unitPrice * qty;
    }
    public String toString(){
        return id + "\t" + desc + "\t" + unitPrice + "\t" + qty;
    }

}
