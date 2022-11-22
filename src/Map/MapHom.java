package Map;

import Map.phonebook.FullName;
import Map.phonebook.PhoneBook;
import Map.recipe.Product;
import Map.recipe.Recipe;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class MapHom {
    private final static Random RANDOM = new Random();

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        while (phoneBook.getEntries().size()<20){
            phoneBook.addPhone(getRandomName(),getPhoneNumber());
        }

        for (Map.Entry<FullName, String> entry: phoneBook.getEntries()){
            System.out.printf("%s - %s%n",entry.getKey(), entry.getValue() );
        }

        Map<Integer, String> orderMap = new LinkedHashMap<>();
        orderMap.put(1,"1");
        orderMap.put(2,"2");
        orderMap.put(3,"3");
        orderMap.put(4,"4");
        orderMap.put(5,"5");
        orderMap.put(6,"6");
        orderMap.put(7,"7");
        orderMap.put(8,"8");
        orderMap.put(9,"9");
        orderMap.put(10,"10");
        for (Map.Entry<Integer,String> entry: orderMap.entrySet()){
            System.out.printf("%d:%s%n", entry.getKey(),entry.getValue());

        }






    }

    public static FullName getRandomName(){
        String name = "Test" + RANDOM.nextInt(1,1_000);
        String lastName = "Egorka" + RANDOM.nextInt(1,1_000);
        return  new FullName(name,lastName);
    }
    public static String getPhoneNumber(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 11; i++) {
            stringBuilder.append(RANDOM.nextInt(1,11));
        }
        return stringBuilder.toString();
    }

}
