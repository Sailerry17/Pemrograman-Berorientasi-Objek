package app;

import java.util.ArrayList;
import java.util.ArrayDeque;
import model.Kucing;
import model.Hewan;

public class Main {

    public static void main(String[] args) {

        // Polimorfisme
        Hewan h = new Kucing("Kitty");
        h.suara();

        // Interface
        Kucing k = new Kucing("Mimi");
        k.makan();

        // ArrayList
        ArrayList<Hewan> daftar = new ArrayList<>();
        daftar.add(h);

        System.out.println("Jumlah Hewan: " + daftar.size());

        // ArrayDeque
        ArrayDeque<String> antrean = new ArrayDeque<>();
        antrean.offer("Pengunjung 1");
        antrean.offer("Pengunjung 2");

        System.out.println("Dilayani: " + antrean.poll());
    }
}