package lab2.challenge2;

public class Main {
    public static void main(String[] args){
        Premiu oscar1990 = new Premiu("oscar",1990);
        Premiu oscar2000 = new Premiu("oscar",2000);
        Premiu oscar2010 = new Premiu("oscar",2010);
        Premiu oscar2018 = new Premiu("oscar",2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01",33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02",60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar 03", 20, new Premiu[]{});

        Film film1= new Film(1990, "film cu actori de oscar", new Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2= new Film(2010, "film cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3= new Film(2010, "film cu actori fara premii3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film4= new Film(2018, "film cu actori de oscar4", new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
        Film film5= new Film(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2= new Studio("Disney", new Film[]{film3,film4,film5});

        Studio[] studioDatabase = new Studio[]{studio1,studio2};
        Film[] filmDatabase = new Film[]{film1,film2,film3,film4,film5};

        String[] aux= query1(studioDatabase);
        for (String s: aux)
            System.out.println(s);
        System.out.println();
        aux= query2(filmDatabase);
        for (String f: aux)
            System.out.println(f);
        System.out.println();
        aux= query3(filmDatabase);
        for (String f: aux)
            System.out.println(f);

    }

    public static String[] query1(Studio[] studioDatabase){
        String aux="";
        for (Studio s : studioDatabase)
            if (s.getFilme().length > 2)
                aux = aux + s.getNume() + "<";
        return aux.split("<");
    }

    public static String[] query2(Film[] filmDatabase){ //presupun ca se cereau nume de filme si ca a existat o eroare in formularea cerintei
        String aux="";
        for (Film f : filmDatabase){
            for(Actor a : f.getActori())
                if (a.getNume()=="actor cu 2 oscaruri") {
                    aux = aux + f.getNume() + "<";
                    break;
                }
        }
        return aux.split("<");
    }

    public static String[] query3(Film[] filmDatabase){
        String aux="";
        for (Film f : filmDatabase){
            for(Actor a : f.getActori())
                if (a.getVarsta()>50) {
                    aux = aux + f.getNume() + "<";
                    break;
                }
        }
        return aux.split("<");
    }

}
