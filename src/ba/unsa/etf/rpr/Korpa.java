package ba.unsa.etf.rpr;
import java.util.ArrayList;

public class Korpa {
    private ArrayList<Artikl> artikli = new ArrayList<>();

    public boolean dodajArtikl(Artikl artikl) {
        if (artikli.size() < 50) {
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

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for (Artikl artikl : artikli) {
            suma = suma + artikl.getCijena();
        }
        return suma;
    }
}
