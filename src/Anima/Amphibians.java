package Anima;

public class Amphibians extends Animals {
    private String livingEnvironment;

    public Amphibians(String name, int birthYear,String livingEnvironment) {
        super(name, birthYear);
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()){
            this.livingEnvironment = livingEnvironment;
        }else {
            this.livingEnvironment = "Озеро";
        }
    }

    public void hunt(){

    }


    public String getLivingEnvironment() {
        return livingEnvironment;
    }
}
