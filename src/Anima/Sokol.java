package Anima;

public class Sokol extends Fly{
    public Sokol(String name, int birthYear, String livingEnvironment, String typeMoved) {
        super(name, birthYear, livingEnvironment, typeMoved);
    }

    @Override
    public void eat() {
        System.out.println("");
    }

    @Override
    public void slepp() {
        System.out.println("");
    }

    @Override
    public void moved() {
        System.out.println("");
    }

    @Override
    public void hunt() {
        System.out.println("");
    }

    @Override
    public void fly() {
        System.out.println("");
    }

    @Override
    public String toString() {
        return  "  " + getName() + "   " + getAge() + "   " +
                getLivingEnvironment() + "   " + getTypeMoved();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
