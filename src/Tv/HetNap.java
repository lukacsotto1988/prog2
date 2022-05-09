package Tv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HetNap {
    private static final int MAXMUSOR = 12;
    private static final int MAXHIRADO = 5;
    private String Nev;

    public String getNev() {
        return Nev;
    }

    public static int getMAXMUSOR() {
        return MAXMUSOR;
    }

    public static int getMAXHIRADO() {
        return MAXHIRADO;
    }

    // KONSTRUKTOR
    public HetNap(String nev) {
        Nev = nev;
        this.musorok = new ArrayList<>(); // Létrehoz egy lista példányt az új HétNap tárolón belül, itt nem határozza meg milyen osztálytípusú lesz a lista
    }

    // LISTA KEZELÉS
    private final ArrayList<Musorok> musorok; // Meghatározza milyen osztálytípusú legyen a lista, privát és végleges

    public int addMusorokSzamat() {
        return musorok.size();
    } // Megszámolja a lista méretét

    public Musorok kiirMusor(int index) {
        return musorok.get(index);
    } // Visszatér a lista i-edik elemének tömbjével

    public void adjhozzaMusort(Musorok musor) { //Hozzáad egy műsor tömböt a listához
        musorok.add(musor);
    }

    public void adjhozzaMusortFilebol() throws FileNotFoundException { //Hozzáad több műsor tömböt egy fájlból
        File myObj = new File("file.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String[] hiradoParts = myReader.nextLine().split("%");
            musorok.add(new Hirado(Integer.parseInt(hiradoParts[0]), hiradoParts[1], Integer.parseInt(hiradoParts[2]), Integer.parseInt(hiradoParts[3])));
        }
        myReader.close();
    }

    // KERESÉS, LISTÁZÁS

    // Kap egy mintázatot, mely alapján egy szűrt ArrayList-et ad vissza
    public <T> ArrayList<T> findItems(IFilter<T> filter) {
        ArrayList<T> found = new ArrayList<>();
        for(Musorok v: musorok) {
            if(filter.isSelected((T)v)) {
                found.add((T)v);
            }
        }
        return found;
    }

    // Ezeket a metódusok átadnak egy mintázatot (keresési feltételeket) a findItems-nek, ami egy ArrayListet ad tovább a printList-nek (lentebb)

    public void printHirado(int anyagokSzama, int hiradoHossza) throws IOException {
        printListToConsole( // Ez nyomtatja (alább)
                sortByNev(
                        findItems( // Itt adja át a keresési feltételeket
                        i ->
                                i instanceof Hirado
                                        && ((Hirado)i).getAnyagSzam() >= anyagokSzama
                                        && ((Hirado)i).getHossz() >= hiradoHossza
                        )
                )
        );
    }

    public ArrayList<Musorok> sortByNev(ArrayList<Musorok> rendez) {
        rendez.sort (
                (o1, o2) -> o1.getNev().compareToIgnoreCase(o2.getNev())
        );
        return rendez;
    }

    public ArrayList<Musorok> sortByHossz(ArrayList<Musorok> rendez) {
        rendez.sort (
                (o1, o2) -> Integer.compare(o1.getHossz(), o2.getHossz())
        );
        return rendez;
    }

    // Ezek a printList-ek, nyomtathatnak konzolra és valahova
    // Konzolra:
    public void printListToConsole(ArrayList<Musorok> listToPrint) {
        for (Musorok i : listToPrint) {
            System.out.println(i.toString());
        }
    }

    // Fájlba:
    public void printListToFile(ArrayList<Musorok> listToPrint) throws IOException {
        FileIras fileom = new FileIras("proba.txt");
        for (Musorok i : listToPrint) {
            fileom.writeFile(i.toString());
        }
    }

    @Override
    public String toString() {
        return "HetNap{" +
                "Nev='" + Nev + '\'' +
                '}';
    }
}
