import Transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
      /*
        Human Maksim = new Human(1998, "", "Минск","бренд-менеджером");
        Human Anna = new Human(1993, "Аня", "Москвы" , "методистом образовательных программ");
        Human Katya = new Human(1992,"Катя","Калининград" , "продакт-менеджером");
        Human Artem = new Human(1995,"Артем","Москва", "директором по развитию бизнеса");
        Human Vadim = new Human(2001,"Вадим","Казани"," не работает");
        System.out.println(Maksim);
        System.out.println(Anna);
        System.out.println(Katya);
        System.out.println(Artem);
        Vadim.setYearOfBrith(-7);
        System.out.println(Vadim);
        System.out.println();

        flower rose = new flower("Роза обыкновенная "," ","Голландия",35.59,0);
        flower hrizontema = new flower("Хризантема", " ", "",15, 5);
        flower pion = new flower("Пион"," ","Англии",69.9,1);
        flower gipsofila = new flower("Гипсофила ", " ","Турции", 19.5,10);
        System.out.println(rose);
        System.out.println(hrizontema);
        System.out.println(pion);
        System.out.println(gipsofila);
        System.out.println();
        */
        Car granta = new Car("Lada" ,
                " Granta",
                "Желтого",
                " России",
                1.7,
                2015,
                "Automatic",
                "T163TH163",
               "Sedan",
                5,
                true,
                new Car.Key(true,true),
                new Car.Insurance(LocalDate.now().plusMonths(3),1000.0f,"112358132"));

        if (!granta.getInsurance().isInsuranceValid()){
            System.out.println("Страховка просрочена");
        }
     //   Car audi = new Car("Audi","A8 50 L TDI quattro",
        //   "черного","Германии",3.0,2020,"",
        //   "","",0);
    //    Car bmw = new Car("BMW","Z8", "черного", "Германии",
        //    3.0,2021,
        //    "","","",0);
     //   Car kia =new Car("Kia", "Sportage 4-го поколения",
        //   " красного","Южной Корее", 2.4, 2018,"",
        //   "","",0);
    //    Car hundai = new Car("Hyundai","Avante", "оранжевый",
        //    "Южной Корее", 0, 0,
        //    "","","",0);
        System.out.println(granta);
      //  System.out.println(audi);
     //   System.out.println(bmw);
      //  System.out.println(kia);
     //   System.out.println(hundai);


    }
}