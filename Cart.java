public class Cart {
    private double total;

	public void addItem(double price) {
        if (price > 0) total += price;
    }

	
    public void addItem(double price, int quantity) {
        if (price > 0 && quantity > 0) total += price* quantity;
    }

    // Task 1.1: overload addItem(double price, int quantity)

    public double getTotal() { return total; }
}
