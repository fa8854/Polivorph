package Transport;

public class Bus extends Transport{
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
    }

}
