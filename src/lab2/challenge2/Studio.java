package lab2.challenge2;

public class Studio {
    private String nume;
    private Film[] filme;

    public String getNume() {
        return nume;
    }
    public Film[] getFilme() {
        return filme;
    }
    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }
}
