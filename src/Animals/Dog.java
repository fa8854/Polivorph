package Animals;

public class Dog extends Pet{

    @Override
    public void eat() {
        System.out.println("Собака ест меясо");
    }

    public Dog(String name){
        this(name,0);
    }

    public Dog(String name, int age){
        super(name, age);
    }


}
