package Animals;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public final class Cat extends Pet {
    private static int count;
    public static int getCount(){
        return count;
    }
    public static class Breed{
        private String name;
        private String country;
        private String hairType;



        public Breed(String name, String country, String hairType) {

            this.name = name;
            this.country = country;
            this.hairType = hairType;
        }

        public String getName() {
            return name;
        }

        public String getCountry() {
            return country;
        }

        public String getHairType() {
            return hairType;
        }
    }

    public class FavToy{
        private String name;

        private String type;

        public FavToy(String name, String type){
            this.name = name;
            this.type = type;
        }

        public String getCatName(){
            return Cat.this.getName();
        }

        public String getName(){
            return name;
        }
        public String getType(){
            return type;
        }
    }

    private List<Pet> friends;

 //   private ArrayList<Pet> friends;

    private Breed breed;

    @Override
    public void eat() {
        System.out.println("Кошка есть мышек");
    }

    public Cat(String name){
        this(name,0);
    }

    public Cat(String name, int age) {
        super(name, age);
        friends = new LinkedList<>();
         count ++;

    }

    public List<Pet> getFriends() {
        return friends;
    }


        public Breed getBreed(){
        return breed;
        }

        public void setBreed(Breed breed){
        if (breed == null){
            this.breed=breed;
        }
        }

        public void meow(){
            System.out.println("Мяу");
            System.out.println("Меня зовут " + getName());
            System.out.println("Мне " + getAge() + " лет.");
        }


}
