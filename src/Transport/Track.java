package Transport;

public class Track extends Transport{



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
}
