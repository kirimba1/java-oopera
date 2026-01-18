public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor();
        actor1.setName("Кирилл"); actor1.setSurname("Комляшов");
        actor1.setHeight(178.6); actor1.setGender(Person.Gender.MALE);

        Actor actor2 = new Actor();
        actor2.setName("Ольга"); actor2.setSurname("Борисова");
        actor2.setHeight(202.7); actor2.setGender(Person.Gender.FEMALE);

        Actor actor3 = new Actor();
        actor3.setName("Сергей"); actor3.setSurname("Симонов");
        actor3.setHeight(185.2); actor3.setGender(Person.Gender.MALE);

        Director director1 = new Director();
        director1.setName("Александра"); director1.setSurname("Толмаченко");

        Director director2 = new Director();
        director2.setName("Джеффри"); director2.setSurname("Симонс");

        String musicAuthor = "Чайковский";
        String choreographer = "Мариус Петипа";
        String librettoOpera = """
        ЕВГЕНИЙ ОНЕГИН
        П.И. Чайковский
        
        ДЕЙСТВИЕ ПЕРВОЕ
        СЦЕНА 1
        
        ХОР ДЕРЕВЕНСКИХ ДЕВУШЕК
        Девушки, красавицы,
        На пруд к нам пожалте...
        """;
        String librettoBallet = """
        ЛЕБЕДИНОЕ ОЗЕРО  
        П.И. Чайковский
        
        ДЕЙСТВИЕ ПЕРВОЕ
        Замок принца Зигфрида.
        Бал в честь совершеннолетия принца...
        """;

        Show show = new Show("Гамлет", 180, director1);
        Opera opera = new Opera("Евгений Онегин", 210, director2,
                                    musicAuthor, librettoOpera, 50);
        Ballet ballet = new Ballet("Лебединое озеро", 190, director1,
                                    musicAuthor, librettoBallet, choreographer);

        show.addNewActorInShow(actor1);
        show.addNewActorInShow(actor2);
        show.addNewActorInShow(actor3);

        opera.addNewActorInShow(actor1);
        opera.addNewActorInShow(actor3);

        ballet.addNewActorInShow(actor2);
        ballet.addNewActorInShow(actor3);

        System.out.println(show);
        System.out.println("=== Актёры в " + show.getTitle() + " ===");
        show.printAllActors();

        System.out.println("\n" + opera);
        System.out.println("=== Актёры в " + opera.getTitle() + " ===");
        opera.printAllActors();

        System.out.println("\n" + ballet);
        System.out.println("=== Актёры в " + ballet.getTitle() + " ===");
        ballet.printAllActors();


        System.out.println("\n=== Замена в спектакле Борисовой на Симонова (дубликат) ===");
        show.replaceActor(actor3, "Борисова");

        System.out.println("\n=== Замена в опере Борисовой на Комляшова (нет такого) ===");
        opera.replaceActor(actor2, "Борисова");

        System.out.println("\n=== Либретто оперы ===");
        opera.printLibrettoText();

        System.out.println("\n=== Либретто балета ===");
        ballet.printLibrettoText();
    }
}
