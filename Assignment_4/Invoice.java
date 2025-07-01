import java.util.Scanner;

class InvoiceItem {
    String id, description;
    int quantity;
    double unitPrice;

    InvoiceItem(String id, String description, int quantity, double unitPrice) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    double getTotalPrice() {
        return quantity * unitPrice;
    }

    double applyDiscount(double discountPercent) {
        return getTotalPrice() * (1 - discountPercent / 100);
    }

    double applyTax(double taxPercent) {
        return getTotalPrice() * (1 + taxPercent / 100);
    }

    void displayInvoice(double discountPercent, double taxPercent) {
        System.out.println("Invoice Details:");
        System.out.println("ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Price (before discount & tax): " + getTotalPrice());
        System.out.println("Price after discount: " + applyDiscount(discountPercent));
        System.out.println("Final Price after Tax: " + applyTax(taxPercent));
    }
}
public class Invoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item ID: ");
        String id = sc.next();
        System.out.print("Enter description: ");
        String desc = sc.next();
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();
        System.out.print("Enter unit price: ");
        double price = sc.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();
        System.out.print("Enter tax percentage: ");
        double tax = sc.nextDouble();
        sc.close();

        InvoiceItem item = new InvoiceItem(id, desc, qty, price);
        item.displayInvoice(discount, tax);
    }
}
