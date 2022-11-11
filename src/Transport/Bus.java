package Transport;

public class Bus extends Transport implements Competing{
    public Bus(String brend, String model, double engineVolume) {
        super(brend, model, engineVolume);
    }

    @Override
    public boolean diagnostic() {
        System.out.println("Автобус " + getBrend() + " " + getModel() + " в диагностике не нуждается");
        return true;
    }

    @Override
    public void printType() {

    }

    @Override
    public void startMoved() {
        System.out.println("Начало движения");

    }

    @Override
    public void stopMoved() {
        System.out.println("Конец движения");

    }

    @Override
    public void pitStop() {
        System.out.println("Остановка на ПИТ-СТОП");

    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время");

    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость");

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

}
