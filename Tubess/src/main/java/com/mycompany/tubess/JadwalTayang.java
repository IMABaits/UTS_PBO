package com.mycompany.tubess;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class JadwalTayang {
    private String idJadwal;
    private String namaTeater;
    private LocalDateTime waktuTayang;
    private double hargaDasar;
    private List<String> listKursiTerisi = new ArrayList<>();

    public JadwalTayang(String idJadwal, String namaTeater, LocalDateTime waktuTayang, double hargaDasar) {
        this.idJadwal = idJadwal;
        this.namaTeater = namaTeater;
        this.waktuTayang = waktuTayang;
        this.hargaDasar = hargaDasar;
    }

    public boolean cekKursi(String nomor) {
        return listKursiTerisi.contains(nomor);
    }

    public void updateHarga(double harga) {
        this.hargaDasar = harga;
    }

    public String getInformasi() {
        return "Jadwal: " + idJadwal + " | Teater: " + namaTeater + " | Waktu: " + waktuTayang + " | Harga: " + hargaDasar;
    }

}
