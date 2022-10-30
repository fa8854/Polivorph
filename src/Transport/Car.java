package Transport;

import java.time.LocalDate;

public class Car {
    private final String barnd;//производитель не изменяемое
    private final   String model;//модель не изменяемое
    private final   int year;//год производства не изменяемое
    private final   String country;//страна не изменяемое
    private final int numOfSeats;//количество мест не изменяемое
    private final String bodyType; //тип кузова не изменяемое
    private  double engineVolume;//кол-во лошединых сил
    private  String color; // цвет кузова
    private String transmission;// коробка передач
    private String regNumber;// регистрационный номер
    private boolean winTires; // резина

    private final Key key;
    private final Insurance insurance;


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
             Insurance insurance){
        this.barnd = defaultOrValue(barnd, "Информация не указана");
        this.model = defaultOrValue(model,"Информация не указана");
        this.color= color;
        this.country = defaultOrValue(country,"Информация не указана");
       this.bodyType = defaultOrValue(bodyType,"Информация не указана");
       this.transmission = defaultOrValue(transmission,"Информация не указана");
        this.key = key;
       this.insurance = insurance;
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
        if (year <=0){
            this.year = 2000;
        }else {
            this.year = year;
        }

    }

    public void setSeasonTired(){
      int currentMonth = LocalDate.now().getMonthValue();
      this.winTires = currentMonth <= 4 || currentMonth >=11;
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

    public String getBarnd() {
        return barnd;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
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
    public void setColor(String color) {
        this.color = color;
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
                "barnd='" + barnd + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", numOfSeats=" + numOfSeats +
                ", bodyType='" + bodyType + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", transmission='" + transmission + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", winTires=" + winTires +
                ", key=" + key +
                ", insurance=" + insurance +
                '}';
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
    }
}