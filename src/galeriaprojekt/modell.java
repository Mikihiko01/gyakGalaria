package galeriaprojekt;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;

public class Modell implements Serializable {

    public Date datum = new Date();

    public Modell() {
    }

    public Date getDatum() {
        return datum;
    }

    @Override
    public String toString() {
        return "Modell{" + "datum=" + datum + '}';
    }
    

    public void faljleterhozasa() {
        File kepfalj = new File("kep.txt");
    }

    
}

class Galeria {

    public void felveszUjtargyakat() throws IOException {
        Files.readAllLines(Paths.get("..\\kep.txt"));
        KiallitasiTargy kl = new KiallitasiTargy() {
        };
        kl.festmenyek();

        ArrayList<KiallitasiTargy> targy = new ArrayList<>();
        KiallitasiTargy fest = null;
        targy.add(1, fest);
        for (KiallitasiTargy kiallitasiTargy : targy) {

        }

    }
}

abstract class KiallitasiTargy {

    public void festmenyek() {
        String festmeny1[] = {"Festmeny1","Festmeny2","Festmeny3"};
    }

}

class Festmeny {

}
