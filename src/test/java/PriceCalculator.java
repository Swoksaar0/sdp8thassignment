public class PriceCalculator implements Visitor {
    private double total = 0;
    public void visit(Book book) {
        total += book.getPrice();
    }
    public void visit(Electronics electronics) {
        total += electronics.getPrice();
    }
    public double getTotal() {
        return total;
    }
}