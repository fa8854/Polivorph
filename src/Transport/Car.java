package Transport;

import java.time.LocalDate;

public class Car extends Transport implements Competing {
    public Car(String brend, String model, double engineVolume) {
        super(brend, model, engineVolume);
    }/*
    private final int numOfSeats;//количество мест не изменяемое
    private final String bodyType; //тип кузова не изменяемое
    private  double engineVolume;//кол-во лошединых сил
    private String transmission;// коробка передач
    private String regNumber;// регистрационный номер
    private boolean winTires; // резина

    private final Key key;
    private final Insurance insurance;

    private String engine;


  public Car(String barnd,
             String model,
             String color,
             String country,
             double engineVolume,
             int year,
             String transmission,
             String regNumber,
             String bodyType,
             int numOfSeats,
             boolean winTires,
             Key key,
             Insurance insurance,
             int maxSpeed,
             String engine
  )
  {
      super(barnd,model,year,country,color,maxSpeed);

       this.bodyType = defaultOrValue(bodyType,"Информация не указана");
       this.transmission = defaultOrValue(transmission,"Информация не указана");
        this.key = key;
       this.insurance = insurance;
       this.engine = defaultOrValue(engine,"Бензиновый");
        setWinTires(winTires);
        setRegNumber(regNumber);

        if (numOfSeats <= 0 ){
            this.numOfSeats = 2;
        }else  {
            this.numOfSeats = numOfSeats;
        }
        if (engineVolume <= 0){
            this.engineVolume = 1.5;
        }else {
            this.engineVolume = engineVolume;
        }


    }

    public void setSeasonTired(){
      int currentMonth = LocalDate.now().getMonthValue();
      this.winTires = currentMonth <= 4 || currentMonth >=11;
    }

    public String getEngine() {
      return engine;
     }

    public boolean isRegNumberValid(){
      if (this.regNumber.length() != 9){
          return false;
      }
      char[]regNumberChars = this.regNumber.toCharArray();
      return isNumberLetter(regNumberChars[0])
              && isNumber(regNumberChars[1])
              && isNumber(regNumberChars[2])
              && isNumber(regNumberChars[3])
              && isNumberLetter(regNumberChars[4])
              && isNumberLetter(regNumberChars[5])
              && isNumber(regNumberChars[6])
              && isNumber(regNumberChars[7])
              && isNumber(regNumberChars[8]) ;
    }

    private boolean isNumber(char symbol){
      return Character.isDigit(symbol);
    }
    private boolean isNumberLetter(char symbol){
      String allowedSymbols = "ABEKMHOPCTYX";
      return allowedSymbols.contains("" + symbol);
    }


    public double getEngineVolume() {
        return engineVolume;
    }



    public int getNumOfSeats() {
        return numOfSeats;
    }

    public String getBodyType() {
        return bodyType;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    public String getRegNumber() {
        return regNumber;
    }
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public void setWinTires(boolean winTires) {
        this.winTires = winTires;
    }

    @Override
    public void refill() {
        System.out.println("можно заправлять на заправке бензином или дизелем, или на электропарковке, если это электрокар");
    }

    public String defaultOrValue(String value, String defaultValue){
        if (value == null || value.isBlank()){
            return defaultValue;
        }else {
            return value;
        }
    }

    public boolean isWinTires() {
        return winTires;
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "barnd='" + getBrend() + '\'' +
                ", model='" + getModel() + '\'' +
             //   ", year=" + getYear() +
             //   ", country='" + getCountry() + '\'' +
                ", numOfSeats=" + numOfSeats +
                ", bodyType='" + bodyType + '\'' +
                ", engineVolume=" + engineVolume +
             //   ", color='" + getColor() + '\'' +
                ", transmission='" + transmission + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", winTires=" + winTires +
                ", key=" + key +
                ", insurance=" + insurance ;
           //     '}' +" max speed = " +  getMaxSpeed();
    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;


        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }


        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }
        public boolean isKeylessAccess(){
            return keylessAccess;
        }
    }
    public static class Insurance{
      private final LocalDate validUntil;
      private final float cost;
      private final String number;

        public Insurance(LocalDate validUntil, float cost, String number) {
            this.validUntil = validUntil != null ? validUntil : LocalDate.now();
            this.cost = Math.max(cost,1f);
            this.number = number;
        }
        public boolean isNumberValid(){
            return number.length() == 9;
        }
        public boolean isInsuranceValid(){
            return LocalDate.now().isBefore(this.validUntil);
        }
    }*/



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

        System.out.println("Лучшее время круга");

    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость");

    }
}