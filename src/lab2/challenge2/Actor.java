package lab2.challenge2;

public class Actor {
    String nume;
    Integer varsta;
    Premiu[] premii;

    public String getNume() {
        return nume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public Actor(String nume, Integer varsta, Premiu[] premii) {
        this.nume = nume;
        this.varsta = varsta;
        this.premii = premii;
    }
}
