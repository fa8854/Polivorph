package Animals;

public class Parrot extends Pet {

    private boolean talk;
    private String breed;

    public Parrot(String name, int age) {
        super(name,age);
    }

    public Parrot(String name) {
        this(name,0);
    }
    public void talk(){
        super.talk();
        System.out.println("Hello");
    }

    @Override
    public void eat() {
        System.out.println("Попугай ест плоть");
    }


    public boolean isTalk() {
        return talk;
    }

    public void setTalk(boolean talk) {
        this.talk = talk;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
