package model;

public abstract class Hewan {
    protected String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public abstract void suara();
}