package Anima;
public class Animals1 {
    public static void main(String[] args) {
        Gazel gazel = new Gazel("Hazel",2,"Пустыня",80,"Трава" );
        System.out.println(gazel);
        gazel.eat();
        Giraf giraf = new Giraf("Giraf",3,"Африка",86,"Трава");
        System.out.println(giraf);
        Horse horse = new Horse("Horse",1,"Polya",99,"Trava");
        System.out.println(horse);
        Giena giena = new Giena("Giena",5,"Afrika",99,"Meat");
        System.out.println(giena);
         Tigr tigr = new Tigr("Шархан",10,"Африка",108,"Мясо");
        System.out.println(tigr);

        Frog frog = new Frog("Frog",1,"water");
        System.out.println(frog);

        GrassSnake snake = new GrassSnake("Snake", 1,"water");
        System.out.println(snake);

        Pavlin pavlin = new Pavlin("pavlik" , 1, " afrika", " beg");
        System.out.println(pavlin);

        Pingvin pingvin = new Pingvin("Ping",2,"ice","walk");
        System.out.println(pingvin);

        dodo dodo = new dodo("dodo",1,"fly","walk");
        System.out.println(dodo);

        Chaika chaika = new Chaika("Chaika",1,"Fly","fly");
        System.out.println(chaika);

        Sokol sokol = new Sokol("Sokol",1,"fly","fly");
        System.out.println(sokol);
    }
}
