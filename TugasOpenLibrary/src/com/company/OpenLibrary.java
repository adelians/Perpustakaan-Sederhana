package com.company;

import java.util.ArrayList;

public class OpenLibrary {
    private ArrayList<Koleksi> arrKoleksi = new ArrayList<>();

    public void addKoleksi(Koleksi koleksi) {
        arrKoleksi.add(koleksi);
    }

    public void displayBuku() {
        for (Koleksi koleksi : arrKoleksi) {
            if (koleksi.getJenis().equalsIgnoreCase("buku")) {
                koleksi.display();
            }
        }
    }

    public void displayMajalah() {
        for (Koleksi koleksi : arrKoleksi) {
            if (koleksi.getJenis().equalsIgnoreCase("majalah")) {
                koleksi.display();
            }
        }
    }

    public void displayKoran() {
        for (Koleksi koleksi : arrKoleksi) {
            if (koleksi.getJenis().equalsIgnoreCase("koran")) {
                koleksi.display();
            }
        }
    }

    public void displayCakramDigital() {
        for (Koleksi koleksi : arrKoleksi) {
            if (koleksi.getJenis().equalsIgnoreCase("Cakram Digital")) {
                koleksi.display();
            }
        }
    }

    public void displayAll(){
        System.out.println("---------Semua Data Koleksi---------");
        System.out.println("*****Data Buku*****");
        for (Koleksi koleksi : arrKoleksi) {
            if (koleksi.getJenis().equalsIgnoreCase("buku")) koleksi.display();
        }
        System.out.println("*****Data Majalah*****");
        for (Koleksi koleksi : arrKoleksi) {
            if (koleksi.getJenis().equalsIgnoreCase("majalah")) koleksi.display();
        }
        System.out.println("*****Data Koran*****");
        for (Koleksi koleksi : arrKoleksi) {
            if (koleksi.getJenis().equalsIgnoreCase("koran")) koleksi.display();
        }
        System.out.println("*****Data Cakram Digital*****");
        for (Koleksi koleksi : arrKoleksi) {
            if (koleksi.getJenis().equalsIgnoreCase("cakram digital")) koleksi.display();
        }
    }
}
