public class flower {
    private  String name;
  private   String flowerColor;
   private String country;
   private double cost;
    int lifeSpan;

    public flower(String name ,String flowerColor, String country, double cost, int lifeSpan ) {
        this.name = name;
        if (flowerColor !=null && !flowerColor.isBlank() && !flowerColor.isEmpty()){
            this.flowerColor = flowerColor;
        }else{
            this.flowerColor = "белая";
        }

        if (country !=null && !country.isBlank() && !country.isEmpty()){
            this.country= country;
        }else{
            this.country = "информации нет";
        }


        if (cost <= 0){
            this.cost = 1;
        }else {
            this.cost = cost;
        }
        if (lifeSpan > 0){
            this.lifeSpan = lifeSpan;
        }else {
            this.lifeSpan = 3;
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor !=null && !flowerColor.isBlank() && !flowerColor.isEmpty()){
            this.flowerColor = flowerColor;
        }else{
            this.flowerColor = "белая";
        }

    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCost(double cost) {
        if (cost <= 0){
            this.cost = 1;
        }else {
            this.cost = cost;
        }

    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan > 0){
            this.lifeSpan = lifeSpan;
        }else {
            this.lifeSpan = 3;
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + flowerColor + " из " + country + " стоимость штуки " + cost +  " срок стояния " + lifeSpan + " дня";
    }
}
