package Anima;

public class GrassSnake extends Amphibians {

    public GrassSnake(String name, int birthYear, String livingEnvironment) {
        super(name, birthYear, livingEnvironment);
    }

    @Override
    public void hunt() {
        System.out.println("Охотиться ");
    }

    @Override
    public void eat() {
        System.out.println("ест ");
    }

    @Override
    public void slepp() {
        System.out.println("спит ");
    }

    @Override
    public void moved() {
        System.out.println("перемещается ");
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return " имя " + getName() + " год рождения " + getAge() + " среда обитания " +  getLivingEnvironment();
    }
}
