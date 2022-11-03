package Anima;

public class Pingvin extends Flightless{
    public Pingvin(String name, int birthYear, String livingEnvironment, String typeMoved) {
        super(name, birthYear, livingEnvironment, typeMoved);
    }

    @Override
    public void eat() {
        System.out.println("ест");
    }

    @Override
    public void slepp() {
        System.out.println("спит");
    }

    @Override
    public void moved() {
        System.out.println("двигается");
    }

    @Override
    public void hunt() {
        System.out.println("охотиться");
    }

    @Override
    public void walk() {
        System.out.println("гуляет");
    }

    @Override
    public String toString() {
        return  " имя " + getName() + " год рождения " + getAge() + " среда обитания " +
                getLivingEnvironment() + " тип передвижения " + getTypeMoved();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
