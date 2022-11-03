package Anima;

public class Horse extends Herbivores{
    public Horse (String name, int birthYear, String livingEnvironment, int speedMoved, String typeEat) {
        super(name, birthYear, livingEnvironment, speedMoved, typeEat);
    }


    @Override
    public String toString() {
        return " кличка животного " +  getName() + " тип еды " + getTypeEat() +
                " среда обитания " + getLivingEnvironment() + " скорость " + getSpeedMoved() +
                "  Год рождения " + getAge() ;
    }

    @Override
    public void walk() {
        System.out.println("Гуляет");
    }

    @Override
    public void eat() {
        System.out.println("ест траву");
    }

    @Override
    public void slepp() {
        System.out.println("ложится спать");
    }

    @Override
    public void moved() {
        System.out.println("Передвигается по прериям");
    }

    @Override
    public void pastis() {
        System.out.println("Пасётся");
    }

}
