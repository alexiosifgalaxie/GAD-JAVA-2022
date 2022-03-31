package lab2.challenge2;

public class Film {
    Integer anAparitie;
    String nume;

    public String getNume() {
        return nume;
    }

    public Actor[] getActori() {
        return actori;
    }

    Actor[] actori;

    public Film(Integer anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }
}
