package Tv;

import java.io.IOException;
import java.util.Scanner;

public class Controller {
    public static void main() throws IOException {
        Scanner consoleScanner = new Scanner(System.in);

        System.out.print("Add meg a heti osszefoglalo nevet: ");
        String hetnapNev = consoleScanner.nextLine();

        HetNap osszeallitas = new HetNap(hetnapNev);
        /*
        int hetnapHanyHirado;
        do {
            System.out.print("Hany Hirado lesz benne: ");
            hetnapHanyHirado = consoleScanner.nextInt();
        } while (hetnapHanyHirado > HetNap.getMAXHIRADO());

        for (int i = 0; i < hetnapHanyHirado; i++) {
            consoleScanner.nextLine();
            System.out.format("Add meg az %d. Hirado cimet: ", i);
            String hiradoNev = consoleScanner.nextLine();

            System.out.format("Add meg az %d. Hirado datumat: ", i);
            int hiradoDatum = consoleScanner.nextInt();

            System.out.format("Add meg az %d. Hirado hosszat: ", i);
            int hiradoHossz = consoleScanner.nextInt();

            System.out.format("Add meg az %d. Hirado anyagainak szamat: ", i);
            int hiradoAnyagszam = consoleScanner.nextInt();

            osszeallitas.adjhozzaMusort(
                    new Hirado(hiradoDatum, hiradoNev, hiradoHossz, hiradoAnyagszam)
            );
        }

        int hetnapHanyStudio;
        do {
            System.out.print("Hany Studio lesz benne: ");
            hetnapHanyStudio = consoleScanner.nextInt();
        } while (hetnapHanyStudio > (HetNap.getMAXMUSOR() - hetnapHanyHirado));

        for (int i = 0; i  < hetnapHanyStudio; i++) {
            consoleScanner.nextLine();
            System.out.format("Add meg az %d. Studio cimet: ", i);
            String studioNev = consoleScanner.nextLine();

            System.out.format("Add meg az %d. Studio datumat: ", i);
            int studioDatum = consoleScanner.nextInt();

            System.out.format("Add meg az %d. Studio hosszat: ", i);
            int studioHossz = consoleScanner.nextInt();

            consoleScanner.nextLine();
            System.out.format("Add meg az %d. Studio vendegenek a nevet: ", i);
            String studioVendeg = consoleScanner.nextLine();

            osszeallitas.adjhozzaMusort(
                    new Studio(studioDatum, studioNev, studioHossz, studioVendeg)
            );
        }

        int hetnapHanyMagazin;
        int b = (HetNap.getMAXMUSOR() - (hetnapHanyHirado + hetnapHanyStudio));
        do {
            System.out.print("Hany magazin lesz benne: ");
            hetnapHanyMagazin = consoleScanner.nextInt();
        } while ( hetnapHanyMagazin > b);

        for (int i = 0; i  < hetnapHanyMagazin; i++) {
            consoleScanner.nextLine();
            System.out.format("Add meg az %d. Magazin cimet: ", i);
            String magazinNev = consoleScanner.nextLine();

            System.out.format("Add meg az %d. Magazin datumat: ", i);
            int magazinDatum = consoleScanner.nextInt();

            System.out.format("Add meg az %d. Magazin hosszat: ", i);
            int magazinHossz = consoleScanner.nextInt();

            System.out.format("Add meg az %d. Magazin anyagainak szamat: ", i);
            int magazinAnyagszam = consoleScanner.nextInt();

            consoleScanner.nextLine();
            System.out.format("Add meg az %d. Magazin vendegenek a nevet: ", i);
            String magazinVendeg = consoleScanner.nextLine();

            osszeallitas.adjhozzaMusort(
                    new Magazin(magazinDatum, magazinNev, magazinHossz, magazinAnyagszam, magazinVendeg)
            );
        }*/
        //listaz(osszeallitas);
        osszeallitas.adjhozzaMusortFilebol();
        osszeallitas.printHirado(4, 20);
    }

    private static void listaz(HetNap hetnap) {
        System.out.printf("========== Musorok ebben a HetNapban: %s%n", hetnap.getNev());
        for(int i = 0; i < hetnap.addMusorokSzamat(); i++) {
            System.out.println(hetnap.kiirMusor(i));
        }
        System.out.println("----------");
    }
}
