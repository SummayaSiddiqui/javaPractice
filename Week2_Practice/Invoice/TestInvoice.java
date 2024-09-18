public class TestInvoice {
    public static void main(String[] args) {
        // Create multiple InvoiceItem objects with different values
        InvoiceItem invoice1 = new InvoiceItem("001", "Laptop", 2, 599.99);
        InvoiceItem invoice2 = new InvoiceItem("002", "Smartphone", 1, 999.99);
        InvoiceItem invoice3 = new InvoiceItem("003", "Tablet", 3, 249.99);
        InvoiceItem invoice4 = new InvoiceItem("004", "Headphones", 4, 79.99);
        InvoiceItem invoice5 = new InvoiceItem("005", "Monitor", 1, 199.99);

        // Display each invoice's details
        System.out.println("Invoice 1: \n" + invoice1 + "\nTotal: " + invoice1.getTotal() + "\n");
        System.out.println("Invoice 2: \n" + invoice2 + "\nTotal: " + invoice2.getTotal() + "\n");
        System.out.println("Invoice 3: \n" + invoice3 + "\nTotal: " + invoice3.getTotal() + "\n");
        System.out.println("Invoice 4: \n" + invoice4 + "\nTotal: " + invoice4.getTotal() + "\n");
        System.out.println("Invoice 5: \n" + invoice5 + "\nTotal: " + invoice5.getTotal() + "\n");

        // Display the total number of invoices created
        System.out.println("Total number of invoices created: " + InvoiceItem.getInvoiceCount());

        // Display each invoice's using toString()
        System.out.println("\nGenerated invoices using toString()");
        System.out.println(invoice1);
        System.out.println(invoice2);
        System.out.println(invoice3);
        System.out.println(invoice4);
        System.out.println(invoice5);

        // Display the total number of invoices created
        System.out.println("\nTotal number of invoices created: " + InvoiceItem.getInvoiceCount());
    }
}
