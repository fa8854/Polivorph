import Transport.Bus;
import Transport.Competing;

public class DriverD <D extends Bus> implements Competing {
    private final String CAT_D = "D";
    private String fio;
    private String presenceDriverLicens;
    private int experience;

    public DriverD(String fio, String presenceDriverLicens, int experience) {

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
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        if (fio != null && !fio.isEmpty() && !fio.isBlank()) {
            this.fio = fio;
        } else {
            this.fio = "Иванов Иван Иванович";
        }
    }

    public String GetPresenceDriverLicens() {
        return presenceDriverLicens;
    }

    public void setPresenceDriverLicens(String presenceDriverLicens) {
        this.presenceDriverLicens = presenceDriverLicens;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience <= 0) {
            this.experience = 3;
        } else {
            this.experience = experience;
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Запарвка");

    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время");

    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость");
    }

    @Override
    public void startMoved() {
        System.out.println("Начало движения");

    }

    @Override
    public void stopMoved() {
        System.out.println("Остановка");

    }

    public void D(D Car){
        System.out.println("У меня категория " + CAT_D);
    }
}
