package galeriaprojekt;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;

public class Modell {

    public Date datum = new Date();

    public void faljleterhozasa() {
        File kepfalj = new File("kep.txt");
    }

}

class Galeria {

    public void felveszUjtargyakat() throws IOException {
        Files.readAllLines(Paths.get("..\\kep.txt"));
        KiallitasiTargy kl = new KiallitasiTargy() {};
        kl.festmeny();
        
        ArrayList<KiallitasiTargy>targy = new ArrayList<>();
        KiallitasiTargy fest = null;
        targy.add(1, fest);
        for (KiallitasiTargy kiallitasiTargy : targy) {
            
        }
        
    }
}

abstract class KiallitasiTargy {
    public void festmeny(){
String fest="Festmeny";
    }
}

class Festmeny {

}
