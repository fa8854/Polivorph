import Transport.Transport;


public abstract class Driver <A extends Transport> {

    private final A car;
    private String fio;
    private String presenceDriverLicens;
    private int experience;

    public Driver(String fio, String presenceDriverLicens, int experience, A car) {

        if (fio != null && !fio.isEmpty() && !fio.isBlank()) {
            this.fio = fio;
        } else {
            this.fio = "Иванов Иван Иванович";
        }

        this.presenceDriverLicens = presenceDriverLicens;

        if (experience <= 0) {
            this.experience = 3;
        } else {
            this.experience = experience;
        }

        this.car = car;
    }

    public String getFio() {
        return fio;
    }

    public String GetPresenceDriverLicens() {
        return presenceDriverLicens;
    }

    public int getExperience() {
        return experience;
    }


    public void pitStop() {
        System.out.println("Запарвка");

    }

    public void bestLapTime() {
        System.out.println("Лучшее время");

    }

    public void startMoved() {
        System.out.println("Начало движения водителя " + this.fio);
        this.car.startMoved();

    }

    public void stopMoved() {
        System.out.println("Остановка водителя " + this.fio);
        this.car.stopMoved();
    }

    public void refill(){
        System.out.println("Водитель заправляеться " + this.car.getBrend() + " " + this.car.getModel());
        this.car.refill();
    }



}

