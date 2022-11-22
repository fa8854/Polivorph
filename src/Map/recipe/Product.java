package Map.recipe;

import java.util.Objects;
public class Product {
    private String name;
    private int cost;


    public Product(String name, int cost, int weight) {
        if (name == null || name.isBlank() || cost < 0){
            throw new IllegalArgumentException("Полностью заполните поля");
        }
        this.name = name;
        this.cost = cost;

    }
    public String getName() {
        return name;
    }
    public int getCost() {
        return cost;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
