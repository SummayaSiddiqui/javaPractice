public class InvoiceItem {
    // Attributes

    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    // Static variable to count the number of invoices
    private static int InvoiceCount = 0;

    // Constructors

    public InvoiceItem() {
        this.id = null;
        this.desc = null;
        this.qty = 0;
        this.unitPrice = 0.0;
        InvoiceCount++; 
    }
    
    // Copy constructor
    public InvoiceItem(InvoiceItem other) {
        this.id = other.id;
        this.desc = other.desc;
        this.qty = other.qty;
        this.unitPrice = other.unitPrice;
        InvoiceCount++;
    }

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
        InvoiceCount++;
    }

    public String getID() {
        return this.id;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return (this.unitPrice * this.qty);
    }

    // Static method to return the current InvoiceCount
    public static int getInvoiceCount() {
        return InvoiceCount;
    }

    public String toString() {
        return ("\nInvoice item: \nID = " + this.id + "\nDesc = " + this.desc + "\nQty = " + this.qty + "\nunitPrice = " + this.unitPrice + "\nTotal = " + this.getTotal());
    }
}