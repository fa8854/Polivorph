package Animals;

import java.time.LocalDate;

public abstract class Pet {
    private String name;   //Имя животного
    private String address;//адрес проживания
    private String phone;
    private int birthYear;

    public void talk(){
        System.out.println("Меня зовут " + getName());

    }

    public abstract void eat();

    public int getAge(){
        return LocalDate.now().getYear() - birthYear;
    }

    public String getName(){
        return name;
    }


    public void setName(String name){
        if (name != null && !name.isEmpty() && !name.isBlank()){
            this.name=name;
        }else{
            this.name = "Кот";
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Pet(String name) {
        this(name,0);
    }

    public Pet(String name, int age) {
        setName(name);

        if (age >=0){
            this.birthYear = LocalDate.now().getYear() - age;
        }else {
            this.birthYear = LocalDate.now().getYear() - Math.abs(age);
        }
    }
}
