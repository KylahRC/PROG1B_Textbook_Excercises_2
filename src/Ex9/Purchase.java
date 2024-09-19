package Ex9;

public class Purchase {
    private int invoiceNumber;
    private double saleAmount;
    private double salesTax;

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setSaleAmount(double saleAmount) {
        this.saleAmount = saleAmount;
        this.salesTax = saleAmount * 0.05;
    }

    public void display() {
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Sale Amount: $" + saleAmount);
        System.out.println("Sales Tax: $" + salesTax);
    }
}
