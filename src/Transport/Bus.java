package Transport;

import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport implements Competing {

    public TypeOfBus typeOfBus;

    public Bus(String brend, String model, double engineVolume, TypeOfBus typeOfBus) {
        super(brend, model, engineVolume);
        this.typeOfBus = typeOfBus;
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

    /*
    public Bus(String brend, String model, int year, String country, String color, int maxSpeed) {
        super(brend, model, year, country, color, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("можно заправлять бензином или дизелем на заправке");
    }

    public String toString(){
        return "brend " + getBrend() + " model " + getModel() + " year " + getYear() + " country " +
                getCountry() + " color " + getColor() + " max speed " + getMaxSpeed();
    }*/

    public void printBus() {
        System.out.println("Автобус: " + getBrend() +
                ", модель: " + getModel() +
                ", объем двигателя: " + getEngineVolume() + " л");
    }

    public void printType() {
        if (typeOfBus == null) {
            System.out.println("Данных по автомобилю недостаточно");
        } else {

            System.out.println(" Вместимость от " + typeOfBus.getFrom() + " до " + typeOfBus.getTo());
        }
    }

    @Override
    public boolean service() {
        return false;
    }

    @Override
    public void repair() {

    }

}

