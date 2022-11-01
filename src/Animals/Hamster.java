package Animals;

public class Hamster extends Pet {
    @Override
    public void eat() {
        System.out.println("Хомяк ест морковь");
    }

    public Hamster(String name) {
        super(name);
    }

    public Hamster(String name, int age) {
        super(name, age);
    }
}
