package Transport;

import java.util.concurrent.ThreadLocalRandom;

public class Track extends Transport implements Competing {

    private TypeOfTrack typeOfTrack;


    public Track(String brend, String model, double engineVolume, TypeOfTrack typeOfTrack) {
        super(brend, model, engineVolume);
        this.typeOfTrack = typeOfTrack;

    }


    public TypeOfTrack getTypeOfTrack() {
        return typeOfTrack;
    }

    public void setTypeOfTrack(TypeOfTrack typeOfTrack) {
        this.typeOfTrack = typeOfTrack;
    }

    @Override
    public void refill() {

    }

    @Override
    public void startMoved() {
        System.out.println("Начало движения" + this.getModel() + this.getBrend());

    }


    @Override
    public void stopMoved() {
        System.out.println("Конец движения" + this.getModel() + this.getBrend());

    }

    @Override
    public void pitStop() {
        System.out.println("Остановка на ПИТ-СТОП " + this.getModel() + this.getBrend());

    }

    @Override
    public int bestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 60);
    }

    @Override
    public int maxSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 60);


    }

    public void printTruck() {
        System.out.println("Грузовик: " + getBrend() +
                ", модель: " + getModel() +
                ", объем двигателя: " + getEngineVolume() + " л");
    }

    public void printType() {
        if (typeOfTrack == null) {
            System.out.println("Данных по автомобилю недостаточно");
        } else {
            String from = typeOfTrack.getFrom() == null? "": " от " + typeOfTrack.getFrom();
            String to = typeOfTrack.getTo() == null? "": " до " + typeOfTrack.getTo();
            System.out.println(" Груз " + from + to);
        }
    }
}
