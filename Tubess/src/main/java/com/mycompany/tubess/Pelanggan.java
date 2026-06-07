package com.mycompany.tubess;

import java.util.ArrayList;
import java.util.List;

public class Pelanggan extends Pengguna {
    private String nomorTelepon;
    private List<Transaksi> listTransaksi = new ArrayList<>();

    public Pelanggan(String idPengguna, String nama, String email, String nomorTelepon) {
        super(idPengguna, nama, email);
        this.nomorTelepon = nomorTelepon;
    }

    public Transaksi buatTransaksi(JadwalTayang j) {
        Transaksi t = new Transaksi("TRX-" + System.currentTimeMillis(), j);
        listTransaksi.add(t);
        return t;
    }

    public List<Transaksi> cekRiwayat() {
        return listTransaksi;
    }

    public boolean validasiData() {
        return !nomorTelepon.isEmpty();
    }

    
}
