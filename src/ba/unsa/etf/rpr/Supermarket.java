package ba.unsa.etf.rpr;
import java.util.ArrayList;

public class Supermarket {
    private ArrayList<Artikl> artikli = new ArrayList<Artikl>();

    public boolean dodajArtikl(Artikl artikl) {
        if (artikli.size() < 1000) {
            artikli.add(artikl);
            return true;
        }
        return false;
    }

    public Artikl[] getArtikli() {
        return artikli.toArray(new Artikl[0]);
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        //Artikl pomocni = null;
        for (int i = 0; i < artikli.size(); i++) {
            if (artikli.get(i).getKod().equals(kod)) {
                Artikl pomocni = new Artikl(artikli.get(i).getNaziv(),artikli.get(i).getCijena(),artikli.get(i).getKod());
                artikli.remove(i);
                return pomocni;
            }
        }
        return null;
    }
}
