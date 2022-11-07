package Transport;

public class Track extends Transport implements Competing{



    public Track(String brend, String model, double engineVolume) {
        super(brend, model,engineVolume);

    }





    @Override
    public void startMoved() {
        System.out.println("Начать движение");

    }

    @Override
    public void stopMoved() {
        System.out.println("остановиться");

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
}
