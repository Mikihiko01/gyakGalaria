package galeriaprojekt;

import java.util.ArrayList;
import java.util.Collections;

public class GaleriaProjekt {

    public static void main(String[] args) {

        Modell m = new Modell();
        m.faljleterhozasa();
        System.out.println(m.toString());
        megjenelit();

    }

    private static void megjenelit() {
        ArrayList<String> keszito = new ArrayList<>();
        keszito.add("Juhász Ferenc");
        keszito.add("Géza Ferenc");
        keszito.add("Juhász Anna");
        ArrayList<String> cim = new ArrayList<>();
        cim.add("Kacsa a tóban");
        cim.add("Golya a tetön");
        cim.add("Ló az istállóban");

        for (String string : cim) {
            Collections.sort(cim);
        }
        for (String string : keszito) {
            Collections.sort(keszito);
        }
        for (String string : cim) {
            System.out.println(cim);
            System.out.println(keszito);
        }

    }

}
