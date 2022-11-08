import Animals.Cat;
import Animals.Dog;
import Animals.Parrot;
import Transport.Car;

public class Work {
    public static void main(String[] args) {
        Cat murzik = new Cat("Мурзик");
        Cat.FavToy murzikFavToy = murzik.new FavToy("Fish","заводная");
        System.out.println(murzikFavToy.getCatName());

        murzik.talk();

        Dog sharik = new Dog("Шарик");
        sharik.talk();
        sharik.eat();

        Parrot kesha = new Parrot("Keha");
        kesha.talk();



    }
}
