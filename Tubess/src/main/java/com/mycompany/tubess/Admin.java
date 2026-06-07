package com.mycompany.tubess;


import java.util.ArrayList;
import java.util.List;

public class Admin extends Pengguna {
    private String levelAdmin;
    private List<Film> listFilmManaged = new ArrayList<>();

     public Admin(String idPengguna, String nama, String email, String levelAdmin) {
        super(idPengguna, nama, email);
        this.levelAdmin = levelAdmin;
    }
     public void kelolaFilm(Film f){
         listFilmManaged.add(f);
     }
     public void kelolaJadwal(JadwalTayang j) {
        System.out.println("Jadwal berhasil dikelola: " + j.getInformasi());
    }

    public boolean validasiData() {
        return !levelAdmin.isEmpty();
    }

}
