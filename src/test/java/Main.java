public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Book("Clean Code", 45.99),
                new Book("Java Book", 39.99),
                new Electronics("Laptop", 999.99),
                new Electronics("Mouse", 29.99)
        };
        TaxCalculator tax = new TaxCalculator();
        PriceCalculator price = new PriceCalculator();
        for (Product p : products) {
            p.accept(tax);
            p.accept(price);
        }
        System.out.println("Total Price: " + price.getTotal());
        System.out.println("Total Tax: " + tax.getTotal());
    }
}
