package Anima;

public class Flightless extends Berd {
    private String typeMoved;
    public Flightless(String name, int birthYear, String livingEnvironment, String typeMoved) {
        super(name, birthYear, livingEnvironment);
        if(typeMoved !=null && !typeMoved.isEmpty() && !typeMoved.isBlank()){
            this.typeMoved = typeMoved;
        }else {
            this.typeMoved = "ходят";
        }
    }

    public String getTypeMoved() {
        return typeMoved;
    }

    public void walk(){

    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
