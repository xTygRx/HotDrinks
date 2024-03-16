public abstract class Product {
    protected String name;
    protected double cost;

    public Product(String name, double cost){
        this.cost = cost;
        this.name = name;
    }


    public Product(){}

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return String.format("Товар: %s, цена: %.2f",this.name, this.cost);
    }
}
