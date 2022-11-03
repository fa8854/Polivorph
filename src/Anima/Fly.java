package Anima;

public class Fly extends Berd{
    private String typeMoved;

    public Fly(String name, int birthYear, String livingEnvironment, String typeMoved) {
        super(name, birthYear, livingEnvironment);
        if (typeMoved != null && !typeMoved.isBlank() && !typeMoved.isEmpty()) {
            this.typeMoved = typeMoved;
        } else {
            this.typeMoved = "Летает";
        }
    }


        public void fly(){

        }

    public String getTypeMoved() {
        return typeMoved;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
