package Transport;



import Driver.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {


    private String brend;   //Марка
    private String model;   //Модель
  /*  private int year;       //год выпуска, не изменяемая
    private String country; //Страна, не изменяемая
   private String color;   //Цвет кузова
    private int maxSpeed;   //максимальная скорость
*/
  private  double engineVolume;

  private final List<Driver> drivers = new ArrayList<>();
    private final List<Mehanic<?>> mehanics = new ArrayList<>();

    private final List<Sponsor> sponsors = new ArrayList<>();


  public String getBrend() {
        return brend;
    }


    public String getModel() {
        return model;
    }

    public double getEngineVolume(){
        return engineVolume;
    }

    public void setBrend(String brend) {
        if (brend != null && !brend.isEmpty() && !brend.isBlank()){
            this.brend=brend;
        }else{
            this.brend = "Автомобиль";
        }
    }

    public void setModel(String model) {
        if (model != null && !model.isBlank() && !model.isEmpty()) {
            this.model = model;
        }else {
            this.model = "Ваз";
        }
    }

   /* public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }*/
   public Transport(String brend,
                    String model,
                    double engineVolume

                    /* ,int year,
                    String country,
                    String color,
                    int maxSpeed*/
   ) {

       this.brend =  defaultOrValue(brend,"Ваз");
       this.model = defaultOrValue(model,"лада");
       if (engineVolume <= 0){
           this.engineVolume = 1.5;
       }else {
           this.engineVolume = engineVolume;
       }
      /*  this.year = year;
        this.country = defaultOrValue(country,"Россия");
        this.color = defaultOrValue(color,"Белый");
        if (maxSpeed<=0){
            this.maxSpeed = 100;
        }else {
            this.maxSpeed = maxSpeed;
        }*/


   }
    public String defaultOrValue(String value, String defaultValue){
        if (value == null || value.isBlank()){
            return defaultValue;
        }else {
            return value;
        }
    }

    public void addDriver(Driver drivers){
       this.drivers.addAll(Arrays.asList(drivers));
    }

    public void addMehanic(Mehanic<?>... mehanics){
       this.mehanics.addAll(Arrays.asList(mehanics));
    }

    public void addSponsor(Sponsor... sponsors){
       this.sponsors.addAll(Arrays.asList(sponsors));
    }



/*
    public void setColor(String color) {
        if (color != null && !color.isBlank() && !color.isEmpty()) {
            this.color = color;
        }else {
            this.color = "Белый";
        }
    }

    public void setMaxSpeed(int maxSpeed) {
       if (maxSpeed <= 0 ){
        this.maxSpeed = 100;
       }else {
           this.maxSpeed = maxSpeed;
       }
    }
*/

    public abstract void refill();


    public abstract void startMoved();

    public abstract void stopMoved();

    public abstract void printType();

    public abstract boolean service();

    public abstract void repair();

    public List<Driver> getDrivers() {
        return drivers;
    }

    public List<Mehanic<?>> getMehanics() {
        return mehanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }
}
