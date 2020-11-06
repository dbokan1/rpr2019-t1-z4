package ba.unsa.etf.rpr;

public class Artikl {
    private int cijena;
    private String naziv, kod;

    public Artikl(String naziv, int cijena, String kod) {
        this.cijena = cijena;
        this.kod = kod;
        this.naziv = naziv;
    }


    public int getCijena() {
        return cijena;
    }

    public String getKod() {
        return kod;
    }

    public String getNaziv() {
        return naziv;
    }


}
