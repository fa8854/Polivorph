import Animals.Pet;

import java.util.LinkedList;
import java.util.Queue;

public class Vetirinarian <T extends Pet>{
    private String name;
    private String specialiti;

    private Queue<T> queue = new LinkedList<>();

    public Vetirinarian(String name, String specialiti) {
        this.name = name;
        this.specialiti = specialiti;
    }

    public void addPatient(T pet){
        queue.offer(pet);
    }

    public void treat(){
        T pet = queue.poll();
        if(pet != null){
            System.out.println("Доктор " + name + " лечит животное "+ pet);
            treat();
        }else {
            System.out.println("Очередь пуста");
        }
    }

    public int queueSize(){
        return queue.size();
    }

    public String getName() {
        return name;
    }

    public String getSpecialiti() {
        return specialiti;
    }
}
