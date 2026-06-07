
package com.mycompany.tubess;


public class Pilm {
    private String idFilm;
    private String judul;
    private String genre;
    private int durasi;
    
    public Pilm(String idFilm, String judul, String genre, int durasi) {
        this.idFilm = idFilm;
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
    }
    public String getDetailFilm() {
        return "idFilm: " +idFilm + " | Film: " + judul + " | Genre: " + genre + " | Durasi: " + durasi + " menit";
    }
}
