package Transport;

import java.time.LocalTime;



//public abstract class Train extends Transport {
//
/*
    private double priceOfTheTrip; //Цена поездки
    private int timeOfTheTrip; //Время поездки
    private String nameDepartureStation; //Название станции отбытия
    private String nameFinalStation; //Конечная остановка
    private int numberOfWagon; //Количество вагонов

    public double getPriceOfTheTrip() {
        return priceOfTheTrip;
    }


    public int getTimeOfTheTrip() {
        return timeOfTheTrip;
    }

    public String getNameDepartureStation() {
        return nameDepartureStation;
    }

    public String getNameFinalStation() {
        return nameFinalStation;
    }

    public int getNumberOfWagon() {
        return numberOfWagon;
    }

    public void setPriceOfTheTrip(double priceOfTheTrip) {
        if (priceOfTheTrip <= 0){
            this.priceOfTheTrip = 1500;
        }else {
            this.priceOfTheTrip = priceOfTheTrip;
        }
    }

    public void setTimeOfTheTrip(int timeOfTheTrip) {
        this.timeOfTheTrip = timeOfTheTrip;
    }

    public void setNameDepartureStation(String nameDepartureStation) {
       if (nameDepartureStation != null && !nameDepartureStation.isEmpty() && !nameDepartureStation.isBlank()){
        this.nameDepartureStation = nameDepartureStation;
       }else{
           this.nameDepartureStation = "Россииская";
       }
    }

    public void setNameFinalStation(String nameFinalStation) {
        if (nameFinalStation != null && !nameFinalStation.isBlank() && !nameFinalStation.isEmpty()){
        this.nameFinalStation = nameFinalStation;
        }else {
            this.nameFinalStation = "Российская";
        }
    }

    public void setNumberOfWagon(int numberOfWagon) {
        if (numberOfWagon > 0) {
            this.numberOfWagon = numberOfWagon;
        }else {
            this.numberOfWagon = 3;
        }
    }

    public Train(String brend,
                 String model,
                 int year,
                 String country,
                 String color,
                 int maxSpeed,
                 double priceOfTheTrip,
                 int timeOfTheTrip,
                 String nameDepartureStation,
                 String nameFinalStation,
                 int numberOfWagon) {
        super(brend, model, year, country, color, maxSpeed);
        this.priceOfTheTrip = priceOfTheTrip;
        this.timeOfTheTrip = timeOfTheTrip;
        this.nameDepartureStation = nameDepartureStation;
        this.nameFinalStation = nameFinalStation;
        this.numberOfWagon = numberOfWagon;
    }

    @Override
    public void refill() {
        System.out.println("нужно заправлять дизелем");
    }

    public String defaultOrValue(String value, String defaultValue){
        if (value == null || value.isBlank()){
            return defaultValue;
        }else {
            return value;
        }
    }

    @Override
    public String toString() {
        return "Train{" +
                " brend "+ getBrend() +
                " priceOfTheTrip= " + priceOfTheTrip +
                ", timeOfTheTrip= " + timeOfTheTrip +
                ", nameDepartureStation= '" + nameDepartureStation + '\'' +
                ", nameFinalStation= '" + nameFinalStation + '\'' +
                ", numberOfWagon= " + numberOfWagon +
                '}';*/
//    }

