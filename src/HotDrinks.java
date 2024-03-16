public class HotDrinks extends Product {
    private double temperature;
    public HotDrinks(String name, double cost, double temperature) {
        super(name, cost);
        this.temperature = temperature;

    }
    public HotDrinks(String name, double cost) {
        this(name, cost, 30.0);

    }
    public HotDrinks(String name) {
        this(name, 3.0, 30.0);

    }
    public String toString() {
        return String.format("Товар: %s, цена: %.2f, температура %.1f ",this.name, this.cost, this.temperature);
    }
}