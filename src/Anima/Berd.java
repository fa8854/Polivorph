package Anima;

public class Berd extends Animals{
    private String livingEnvironment;

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public Berd(String name, int birthYear, String livingEnvironment) {
        super(name, birthYear);
        if (livingEnvironment != null && !livingEnvironment.isBlank() && !livingEnvironment.isEmpty()){
            this.livingEnvironment = livingEnvironment;
        }else {
            this.livingEnvironment = "Где их только нет";
        }

    }

    public void hunt(){

    }
}
