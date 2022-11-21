import Anima.Animals;
import Animals.*;
import Transport.Car;

import java.util.*;

public class Work {
    public static void main(String[] args) {
//        Cat murzik = new Cat("Мурзик");
//        Cat.FavToy murzikFavToy = murzik.new FavToy("Fish","заводная");
//        System.out.println(murzikFavToy.getCatName());
//
////        murzik.talk();
//
//
//        Dog sharik = new Dog("Шарик");
////        sharik.talk();
////        sharik.eat();
//
//        Parrot kesha = new Parrot("Кеша");
////        kesha.talk();
//
//        murzik.getFriends().add(murzik);
//        murzik.getFriends().add(sharik);
//        murzik.getFriends().add(kesha);
//
//        for (Pet friend : murzik.getFriends()){
//            if (friend instanceof Cat){
//                Cat cat = (Cat) friend;
//                cat.meow();
//            }else if(friend.getClass() == Parrot.class){
//                ((Parrot) friend).talk();
//            }else {
//                System.out.println(friend);
//            }
//        }
//
//        Vetirinarian<Cat> aleks = new Vetirinarian<>("Алексей", "Терапевт");
//        aleks.addPatient(murzik);
//
//        aleks.treat();
//
//        ArrayList<String > list = new ArrayList<>();
//        list.add("Шарик");
//        list.add("Мурзик");
//        list.add("Кеша");
//        System.out.println(Arrays.toString(list.toArray()));
//
//        Set<String > set = new HashSet<>();
//        set.add("Шарик");
//        set.add("Мурзик");
//        set.add("Кеша");
//        set.add("Кеша");
//        System.out.println(Arrays.toString(set.toArray()));

        Product banan = new Product("Банан",200,1);
        Product fish = new Product("Путасу",150,1);
        Product apple =new Product("Яблоко",65,1);
        ProductList productList = new ProductList();
        productList.addProduct(banan);
        productList.addProduct(fish);
        productList.addProduct(apple);
        System.out.println(productList);
        numbSetRemoveEven();
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        System.out.println(multiplicationTable);
        Task task = new Task (3, 4);
        Task task2 = new Task (4, 3);
        Set<Task> set = new HashSet<>();
        set.add(task);
        set.add(task2);
        System.out.println(set);

        Pasport pasport = new Pasport(205456,"Familia","name","????");





    }

    private static void numbSetRemoveEven(){
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        while (numbers.size() < 20){
            numbers.add(random.nextInt(0,1000));
        }
        System.out.println(numbers);
        Iterator<Integer> numberIterator = numbers.iterator();
        while (numberIterator.hasNext()){
            int number = numberIterator.next();
            if (number % 2 != 0){
                numberIterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
