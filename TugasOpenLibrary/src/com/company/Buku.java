package com.company;

public class Buku extends Koleksi {
    private String pengarang, issn, isbn, doi, arxivId;
    private int tahunMasuk;

    public Buku(int noKoleksi, String nama, String penerbit, String tanggalTerbit, String jenis,
                String status, String pengarang, String issn, String isbn, String doi, String arxivId,
                int tahunMasuk) {
        super(noKoleksi, nama, penerbit, tanggalTerbit, jenis, status);
        this.pengarang = pengarang;
        this.issn = issn;
        this.isbn = isbn;
        this.doi = doi;
        this.arxivId = arxivId;
        this.tahunMasuk = tahunMasuk;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getIssn() {
        return issn;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getDoi() {
        return doi;
    }

    public String getArxivId() {
        return arxivId;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    @Override
    public void display() {
        System.out.println("No Koleksi                  : " + getNoKoleksi() +
                "\nJudul Koleksi               : " + getNama() +
                "\nPenerbit                    : " + getPenerbit() +
                "\nTanggal Terbit              : " + getTanggalTerbit() +
                "\nJenis Koleksi               : " + getJenis() +
                "\nStatus Koleksi              : " + getStatus() +
                "\nPengarang                   : " + getPengarang() +
                "\nISSN                        : " + getIssn() +
                "\nISBN                        : " + getIsbn() +
                "\nDOI                         : " + getDoi() +
                "\narXiv ID                    : " + getArxivId() +
                "\nTahun Masuk                 : " + getTahunMasuk());
        System.out.println("*****************************************************");
    }
}
