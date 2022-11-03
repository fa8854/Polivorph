package Anima;

import java.util.Objects;

public abstract class Mammals extends Animals {
    private String livingEnvironment;
    private int speedMoved;

    public Mammals(String name, int birthYear) {
        super(name, birthYear);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }
    public int getSpeedMoved() {
        return speedMoved;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null && !livingEnvironment.isBlank() && !livingEnvironment.isEmpty()){
        this.livingEnvironment = livingEnvironment;
            }else {
            this.livingEnvironment = "Жизнь это боль";
        }
    }

    public  abstract  void  walk();

    public Mammals(String name, int birthYear, String livingEnvironment, int speedMoved) {
        super(name, birthYear);
        this.livingEnvironment = livingEnvironment;
        this.speedMoved = speedMoved;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mammals mammals = (Mammals) o;
        return speedMoved == mammals.speedMoved && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livingEnvironment, speedMoved);
    }
}
