package Anima;

public abstract class Herbivores extends Mammals{

    private String typeEat;

    public Herbivores(String name, int birthYear, String livingEnvironment, int speedMoved, String typeEat) {
        super(name, birthYear, livingEnvironment, speedMoved);
        this.typeEat = typeEat;
    }

    public String getTypeEat() {
        return typeEat;
    }

    public void pastis(){

    }



}


