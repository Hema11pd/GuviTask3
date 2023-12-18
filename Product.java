package GuviTask3;

public class Product implements Taxable{
    int pid;
    double price;
    int quantity;
    public Product(int pid,double price,int quantity)
    {
        this.pid = pid;
        this.price = price;
        this.quantity=quantity;
    }

    @Override
    public void calcTax() {
        double salesTaxFinal = salesTax * price * quantity;
        System.out.printf("PID: "+pid+" Price: "+price+" Quantity: "+quantity+" SalesTaxFinal:  "+salesTaxFinal);

    }
}
