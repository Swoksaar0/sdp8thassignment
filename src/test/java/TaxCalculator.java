public class TaxCalculator implements Visitor {
    private double total = 0;
    public void visit(Book book) {
        total += book.getPrice() * 0.05;
    }
    public void visit(Electronics electronics) {
        total += electronics.getPrice() * 0.15;
    }
    public double getTotal() {
        return total;
    }
}