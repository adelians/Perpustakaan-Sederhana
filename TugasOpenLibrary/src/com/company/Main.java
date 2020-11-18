package com.company;

import java.util.*;

public class Main {
    static OpenLibrary opLib = new OpenLibrary();

    public static void tambahKoleksi() {
        int menu;
        String jenisKoleksi, status, judulKoleksi, penerbit, tanggalTerbit;
        int noKoleksi;
        System.out.println("Menu : \n1. Tambah Buku \n2. Tambah Majalah \n3. Tambah Koran \n4. Tambah Cakram Digital");
        System.out.print("Pilih [1/2/3/4]                                  : ");
        Scanner scanner = new Scanner(System.in);
        menu = scanner.nextInt();
        switch (menu) {
            case 1:
                jenisKoleksi = "Buku";
                System.out.print("Masukkan No Koleksi                              : ");
                noKoleksi = scanner.nextInt();
                System.out.print("Masukkan Judul                                   : ");
                judulKoleksi = scanner.next();
                System.out.print("Masukkan Penerbit                                : ");
                penerbit = scanner.next();
                System.out.print("Masukkan Tanggal Terbit                          : ");
                tanggalTerbit = scanner.next();
                System.out.print("Masukkan Status [Ada/Rusak/Hilang]               : ");
                status = scanner.next();
                System.out.print("Masukkan Pengarang                               : ");
                String pengarang = scanner.next();
                System.out.print("Masukkan ISSN                                    : ");
                String issn = scanner.next();
                System.out.print("Masukkan ISBN                                    : ");
                String isbn = scanner.next();
                System.out.print("Masukkan DOI                                     : ");
                String doi = scanner.next();
                System.out.print("Masukkan arXiv ID                                : ");
                String arxivId = scanner.next();
                System.out.print("Masukkan Tahun Masuk                             : ");
                int tahunMasuk = scanner.nextInt();
                opLib.addKoleksi(new Buku(noKoleksi, judulKoleksi, penerbit, tanggalTerbit, jenisKoleksi, status, pengarang,
                        issn, isbn, doi, arxivId, tahunMasuk));
                System.out.println("Buku Berhasil Ditambahkan");
                break;
            case 2:
                jenisKoleksi = "Majalah";
                System.out.print("Masukkan Nomor Koleksi                           : ");
                noKoleksi = scanner.nextInt();
                System.out.print("Masukkan Judul                                   : ");
                judulKoleksi = scanner.next();
                System.out.print("Masukkan Penerbit                                : ");
                penerbit = scanner.next();
                System.out.print("Masukkan Tanggal Terbit                          : ");
                tanggalTerbit = scanner.next();
                System.out.print("Masukkan Status [Ada/Rusak/Hilang]               : ");
                status = scanner.next();
                System.out.print("Masukkan No Edisi                                : ");
                int noEdisi = scanner.nextInt();
                System.out.print("Masukkan Jenis Terbit Majalah [Mingguan/Bulanan] : ");
                String jenisTerbitMajalah = scanner.next();
                opLib.addKoleksi(new Majalah(noKoleksi, judulKoleksi, penerbit, tanggalTerbit, jenisKoleksi, status, noEdisi,
                        jenisTerbitMajalah));
                System.out.println("Majalah Berhasil Ditambahkan");
                break;
            case 3:
                jenisKoleksi = "Koran";
                System.out.print("Masukkan Nomor Koleksi                           : ");
                noKoleksi = scanner.nextInt();
                System.out.print("Masukkan Judul                                   : ");
                judulKoleksi = scanner.next();
                System.out.print("Masukkan Penerbit                                : ");
                penerbit = scanner.next();
                System.out.print("Masukkan Tanggal Terbit                          : ");
                tanggalTerbit = scanner.next();
                System.out.print("Masukkan Status [Ada/Rusak/Hilang]               : ");
                status = scanner.next();
                System.out.print("Masukkan Jenis Terbit Koran [Harian/Mingguan]    : ");
                String jenisTerbitKoran = scanner.next();
                opLib.addKoleksi(new Koran(noKoleksi, judulKoleksi, penerbit, tanggalTerbit, jenisKoleksi, status, jenisTerbitKoran));
                System.out.println("Koran Berhasil Ditambahkan");
                break;
            case 4:
                jenisKoleksi = "Cakram Digital";
                System.out.print("Masukkan Nomor Koleksi                           : ");
                noKoleksi = scanner.nextInt();
                System.out.print("Masukkan Judul                                   : ");
                judulKoleksi = scanner.next();
                System.out.print("Masukkan Pihak Penerbit                          : ");
                penerbit = scanner.next();
                System.out.print("Masukkan Tanggal Terbit                          : ");
                tanggalTerbit = scanner.next();
                System.out.print("Masukkan Status [Ada/Rusak/Hilang]               : ");
                status = scanner.next();
                System.out.print("Masukkan Jenis Media [Biasa/Bluray]              : ");
                String jenisMedia = scanner.next();
                opLib.addKoleksi(new CakramDigital(noKoleksi, judulKoleksi, penerbit, tanggalTerbit, jenisKoleksi, status,
                        jenisMedia));
                System.out.println("Cakram Digital Berhasil Ditambahkan");
                break;
            default:
                System.out.println("Masukkan Pilihan Yang Benar!");
                break;
        }
    }

    public static void displayKoleksi() {
        int menu;
        System.out.println("Menu : " +
                "\n1. Tampilkan data Buku " +
                "\n2. Tampilkan data Majalah " +
                "\n3. Tampilkan data Koran " +
                "\n4. Tampilkan data Cakram Digital" +
                "\n5. Tampilkan semua data Koleksi");
        System.out.print("Pilih [1/2/3/4/5] : ");
        Scanner scanner = new Scanner(System.in);
        menu = scanner.nextInt();
        switch (menu) {
            case 1:
                System.out.println("********Data Buku********");
                opLib.displayBuku();
                break;
            case 2:
                System.out.println("********Data Majalah********");
                opLib.displayMajalah();
                break;
            case 3:
                System.out.println("********Data Koran*******");
                opLib.displayKoran();
                break;
            case 4:
                System.out.println("********Data Cakram Digital********");
                opLib.displayCakramDigital();
                break;
            case 5:
                opLib.displayAll();
                break;
            default:
                System.out.println("Masukkan Pilihan Yang Benar!");
                break;
        }
    }

    public static void main(String[] args) {
        int menu;
        opLib.addKoleksi(new Buku(1, "Manusia Setengah Salmon", "Gagas Media", "21 Desember", "Buku", "Ada", "Raditya Dika", "-", "979-780-531-X", "-", "-", 2011));
        opLib.addKoleksi(new Buku(2, "Surat Kecil Untuk Tuhan", "Inandra Published", "21 September", "Buku", "Rusak", "Agnes Danovar", "-", "978-979-18346-3-6", "-", "-", 2011));
        opLib.addKoleksi(new Buku(3, "Laskar Pelangi", "Bentang", "22 September", "Buku", "Hilang", "Andrea Hirata", "-", "979-3062-79-7", "-", "-", 2007));
        opLib.addKoleksi(new Majalah(5, "Manis Di Rapat, Pahit Di Aturan", "Tempo", "14 November", "Majalah", "Ada", 15, "Bulanan"));
        opLib.addKoleksi(new Majalah(7, "Bukti Musik Membuat Senang", "Tempo", "14 November", "Majalah", "Rusak", 15, "Bulanan"));
        opLib.addKoleksi(new Majalah(6, "Berawal Dari Komik", "Tempo", "14 November", "Majalah", "Hilang", 15, "Mingguan"));
        opLib.addKoleksi(new Koran(4, "BPK Akan Audit Lembaga Pengelola Investasi", "Koran Tempo", "17 November", "Koran", "Ada", "Harian"));
        opLib.addKoleksi(new Koran(9, "Pembahasan Stimulus Migas Berlanjut", "Koran Tempo", "17 November", "Koran", "Rusak", "Mingguan"));
        opLib.addKoleksi(new Koran(8, "Tarif Baru Jalan Bebas Hambatan", "Koran Tempo", "17 November", "Koran", "Hilang", "Mingguan"));
        opLib.addKoleksi(new CakramDigital(11, "Barbie Princess Adventure", "Disney", "21 Desember", "Cakram Digital", "Ada", "Biasa"));
        opLib.addKoleksi(new CakramDigital(10, "Barbie Mariposa", "Disney", "21 Desember", "Cakram Digital", "Rusak", "Biasa"));
        opLib.addKoleksi(new CakramDigital(12, "Barbie Girls", "Disney", "21 Desember", "Cakram Digital", "Hilang", "Bluray"));
        do {
            System.out.println("Menu : \n1. Input Koleksi \n2. Display Koleksi \n3. Exit");
            System.out.print("Pilih [1/2/3]                                    : ");
            Scanner scanner = new Scanner(System.in);
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    tambahKoleksi();
                    break;
                case 2:
                    displayKoleksi();
                    break;
                case 3:
                    System.out.println("Bye....!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Masukkan Pilihan Yang Benar!");
                    break;
            }
        } while (true);
    }
}
