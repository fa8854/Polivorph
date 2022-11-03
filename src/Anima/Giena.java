package Anima;

import Anima.Predator;

public class Giena extends Predator {

    public Giena(String name, int birthYear, String livingEnvironment, int speedMoved, String typeEat) {
        super(name, birthYear, livingEnvironment, speedMoved, typeEat);
    }

    @Override
    public void eat() {
        System.out.println("Ест мясо");
    }

    @Override
    public void slepp() {
        System.out.println("спит");
    }

    @Override
    public void moved() {
        System.out.println("ходит");
    }

    @Override
    public void hunt() {
        System.out.println("Охотиться");
    }

    @Override
    public void walk() {
        System.out.println("Гуляет");
    }

    @Override
    public String toString() {
        return " кличка животного " +  getName() + " тип еды " + getTypeEat() +
                " среда обитания " + getLivingEnvironment() + " скорость " + getSpeedMoved() +
                "  Год рождения " + getAge() ;
    }
}
