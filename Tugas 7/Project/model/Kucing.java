package model;

import service.Suara;

public class Kucing extends Hewan implements Suara {

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void suara() {
        System.out.println(nama + " : Meong");
    }

    @Override
    public void makan() {
        System.out.println(nama + " sedang makan.");
    }
}