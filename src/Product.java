import java.util.Objects;
public class Product {
    private String name;
    private int cost;
    private int weight;
    private boolean checked;

    public Product(String name, int cost, int weight) {
        if (name == null || name.isBlank() || cost < 0 || weight < 0){
            throw new IllegalArgumentException("Полностью заполните поля");
        }
        this.name = name;
        this.cost = cost;
        this.weight = weight;
        this.checked = false;
    }
    public String getName() {
        return name;
    }
    public int getCost() {
        return cost;
    }
    public int getWeight() {
        return weight;
    }
    public void setChecked() {
        this.checked = true;
    }
    public boolean isChecked(){
        return checked;
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
        String checkedString = this.isChecked() ? "Да": "Нет";
        return String.format( "Product{" +
                "name='" + this.name + '\'' +
                ", cost=" + this.cost +
                ", weight=" + this.weight, checkedString);
    }
}
