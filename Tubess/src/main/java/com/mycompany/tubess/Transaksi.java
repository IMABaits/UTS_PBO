package com.mycompany.tubess;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Transaksi {
    private String idTransaksi;
    private LocalDateTime tglTransaksi;
    private double totalBayar;
    private String status;
    private List<String> kursiDipilih = new ArrayList<>();

    public Transaksi(String idTransaksi, JadwalTayang j) {
        this.idTransaksi = idTransaksi;
        this.tglTransaksi = LocalDateTime.now();
        this.totalBayar = j != null ? j.getInformasi().length() * 1000 : 0; // simulasi harga
        this.status = "Pending";
    }

    public double hitungTotal() {
        return totalBayar;
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public void cetakTiket() {
        System.out.println("Tiket dicetak untuk transaksi: " + idTransaksi);
    }

}
