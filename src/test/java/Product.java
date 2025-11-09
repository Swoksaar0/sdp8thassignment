public interface Product {
    void accept(Visitor visitor);
    String getName();
    double getPrice();
}