
package galeriaprojekt;

import java.util.ArrayList;

public class GaleriaProjekt {

    public static void main(String[] args) {
        ArrayList<String> keszito = new ArrayList<>();
        keszito.add("Juhász Ferenc");
        keszito.add("Géza Ferenc");
        keszito.add("Juhász Anna");
        ArrayList<String> cim = new ArrayList<>();
        cim.add("Kacsa a tóban");
        cim.add("Golya a tetön");
        cim.add("Ló az istállóban");
       
        Modell m = new Modell();
        m.faljleterhozasa();
        //készitő és cím a mai dátumal
        Galeria g = new Galeria();
    }
    
}
