package Transport;

public abstract class Transport {
    private String brend;   //Марка
    private String model;   //Модель
  /*  private int year;       //год выпуска, не изменяемая
    private String country; //Страна, не изменяемая
   private String color;   //Цвет кузова
    private int maxSpeed;   //максимальная скорость
*/
  private  double engineVolume;
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
   public Transport(String brend, String model, double engineVolume
                    // ,int year, String country, String color, int maxSpeed
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
}
