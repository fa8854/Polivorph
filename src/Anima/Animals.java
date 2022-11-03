package Anima;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Animals {
    private String name;
    private int birthYear;

    //Геттеры и сетторы
    public int getAge(){
        return LocalDate.now().getYear() - birthYear;
    }
    public String getName() {
        return name;
    }
    public void setBirthYear(int birthYear) {
       if(birthYear >= 0){
        this.birthYear = birthYear;
       }else {
           this.birthYear = 1;
       }
    }
    public void setName(String name) {
        if (name != null && !name.isBlank() && !name.isEmpty()){
        this.name = name;
        }else {
            this.name = "Животное";
        }
    }

    //Методы
    public void eat() {
    }

    public  void slepp(){

    }

    public void moved() {
    }

    public Animals(String name, int birthYear) {
        if (name != null && !name.isBlank() && !name.isEmpty()){
            this.name = name;
        }else {
            this.name = "Животное";
        }

        if(birthYear >= 0){
            this.birthYear = birthYear;
        }else {
            this.birthYear = 1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return birthYear == animals.birthYear && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthYear);
    }
}
