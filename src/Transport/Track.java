package Transport;

import java.util.concurrent.ThreadLocalRandom;

public class Track extends Transport implements Competing{



    public Track(String brend, String model, double engineVolume) {
        super(brend, model,engineVolume);

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
        System.out.println("Остановка на ПИТ-СТОП " +  this.getModel() + this.getBrend());

    }

    @Override
    public int bestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 60);
    }

    @Override
    public int maxSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 60);


    }
    public void printTruck () {
        System.out.println("Грузовик: " + getBrend() +
                ", модель: " + getModel() +
                ", объем двигателя: " + getEngineVolume() + " л");
    }
}
