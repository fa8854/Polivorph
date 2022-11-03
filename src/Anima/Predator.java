package Anima;

public class Predator extends Mammals {
    private String typeEat;

    public Predator(String name, int birthYear, String livingEnvironment, int speedMoved, String typeEat) {
        super(name, birthYear, livingEnvironment, speedMoved);
        this.typeEat = typeEat;
    }


    public String getTypeEat() {
        return typeEat;
    }

    public void hunt(){

    }

    @Override
    public void walk() {

    }
}
