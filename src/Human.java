public class Human {
    public int yearOfBrith;
    public String name;
    public String town;
    public String jobTitle;


    Human(int yearOfBrith, String name,String town, String jobTitle){
        if (yearOfBrith <=0){
            this.yearOfBrith = Math.abs(yearOfBrith);
        } else {
            this.yearOfBrith = yearOfBrith;
        }
        if (name == null || name.isBlank()){
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null || town.isBlank()){
            this.town = "Информация не указана";
        }else {
            this.town = town;
        }
        if (jobTitle == null || jobTitle.isBlank()){
            this.town = "Информация не указана";
        }else {
            this.jobTitle = jobTitle;
        }
    }
    public int getYearOfBrith() {
        return yearOfBrith;
    }
    public String getName() {
        return name;
    }
    public String getTown() {
        return town;
    }
    public String getJobTitle() {
        return jobTitle;
    }

    public void setYearOfBrith(int yearOfBrith) {
    if (yearOfBrith <= 0){
        this.yearOfBrith = 0;

        }


    }

    public void setTown(String town) {
        if (town != null && !town.isEmpty() && !town.isBlank()){

            this.town = town;
        }else {
            this.town = "Информация не указана";
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + " Я из города " + town  + " Я родился в " + yearOfBrith  + " году. Я работаю на должности " +
                jobTitle +  " .Будем знакомы! ";
    }
}
