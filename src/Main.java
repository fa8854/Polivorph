import Transport.Bus;
import Transport.Car;
import Transport.Track;
import Transport.Transport;
//import Transport.Car;
import Transport.TypeOfByde;
import Transport.TypeOfTrack;
import Transport.TypeOfBus;
import Transport.Mehanic;
import Transport.Sponsor;
import Driver.Driver;
import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Transport.ServiceStation;


import java.util.List;


public class Main {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

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
       /* Car granta = new Car("Lada" ,
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
                new Car.Insurance(LocalDate.now().plusMonths(3),1000.0f,"112358132"),
                190,"Бензиновый");
        granta.refill();

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

    Train lastochka = new Train("Ласточка","B-901",2011,"России",
            " ",301,3500,3 ,  "Белоруский вокзал","Минск-Пассажирский",
            11);
    System.out.println(lastochka);

    Train leningrad = new Train("Ленинград",
            " D-125",
            2019, "России", " ", 270, 1700, 2,"Ленинградского вокзала" ,
            "Ленинград-Пассажирский", 8 );
        System.out.println(leningrad);

        Bus one = new Bus("Vaz","lada",1999,"Russia","black",120);
        System.out.println(one);
        Bus two = new Bus("Lada", "2103",2000,"russia","white",90);
        Bus three = new Bus("", "", 2000,"russia", "black", 30);




    }
*/
     Sponsor mishlen = new Sponsor("Meshlen",20000);
     Sponsor minvoda = new Sponsor("Minvod",2002200);
     Sponsor domru = new Sponsor("domru",500000);
     Sponsor transTrack = new Sponsor("TransTrack",899001324);


     Mehanic petrovich = new Mehanic<Car>("Sergei", "Petrovich", "SP");
     Mehanic lenia = new Mehanic<Track>("Aleksei","Davidov","Track");
     Mehanic sania = new Mehanic<Bus>("Sania", "Lapouhov","turok");




        Car car1= new Car("Vaz","2103",1.6, TypeOfByde.SEDAN);
        car1.addDriver(new DriverB("Ivan","23",23, car1));
        car1.addMehanic(petrovich);
        car1.addSponsor(mishlen, minvoda);
        Car car2= new Car("Vaz","2110",1.5,TypeOfByde.SEDAN);
        Car car3= new Car("Vaz","2114",1.7,TypeOfByde.SEDAN);
        Car car4= new Car("Vaz","2106",1.6,TypeOfByde.SEDAN);

        Track track1 = new Track("Kamaz","Elefant",3.7,TypeOfTrack.N2);
        Driver nikolai = new DriverC("Nikolae Nikolai",4,track1);
        track1.addDriver(nikolai);
        track1.addMehanic(lenia);
        track1.addSponsor(domru);



        Track track2 = new Track("Kamaz","Giraf",2.7,TypeOfTrack.N1);
        Track track3 = new Track("Kamaz","Gigant",4.7,TypeOfTrack.N1);
        Track track4 = new Track("Kamaz","Marko",5.7, TypeOfTrack.N1);

        Bus bus1= new Bus("Автобус","Praagon",2.4, TypeOfBus.EXTRA_SMALL);
        Driver arash = (Driver) new DriverD("Arash Arashovic","D",30,bus1);
        bus1.addDriver(arash);
        bus1.addMehanic(sania);
        bus1.addSponsor(domru,mishlen);

        Bus bus2= new Bus("Автобус","Praaeon",2.4, TypeOfBus.EXTRA_SMALL);
        Bus bus3= new Bus("Автобус","Praaeon",2.4, TypeOfBus.EXTRA_SMALL);
        Bus bus4= new Bus("Автобус","Praqon",2.4, TypeOfBus.EXTRA_SMALL);


        List<Transport> transports = List.of(car1,track1,bus1);




        printInfo(car1);
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(car1);
        serviceStation.service();







     }

     private  static  void printInfo(Transport transport){
         System.out.println(" information avto "+ transport.getBrend() + " " + transport.getModel());
         System.out.println("Driver ");
         for (Driver driver : transport.getDrivers()){
             System.out.println(driver.getFio());
         }
         System.out.println("Sponsors");
         for(Sponsor sponsor : transport.getSponsors()){
             System.out.println(sponsor.getName());
         }
         System.out.println("mehanics");
         for (Mehanic mehanic: transport.getMehanics()){
             System.out.println(mehanic.getName());
         }


     }

     private static void service(Transport... transports){
        for(Transport transport: transports){
            serviceTransport(transport);
        }
     }

     private static void serviceTransport(Transport transport){
        try {
            if (!transport.service()){
                throw new RuntimeException("Автомобиль " + transport.getBrend()+ " " + transport.getModel()
                + " не прошёл диагностику");
            }
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }


     }








    }
