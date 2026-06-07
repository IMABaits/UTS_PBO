package com.mycompany.tubess;

public class Pengguna {
    private String idPengguna;
    private String nama;
    private String email;
    
    public Pengguna (String idPengguna, String nama, String email){
        this.idPengguna = idPengguna;
        this.nama = nama;
        this.email = email;
    }
    public boolean login(){
        return true;
    }
    public void logout(){
        System.out.println("Pengguna keluar.");
    }
    public String getInformasi(){
        return "ID: " + idPengguna + " | Nama: " + nama + " | Email: " + email;
    }
}
