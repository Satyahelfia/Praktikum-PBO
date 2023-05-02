package com.satyahelfi.pbo.Pertemuan3;

public class SepedaMotor { //class = SepedaMotor
    
    //Jika menggunakan privat maka menggunakan getter and setter untuk memanggil
    //atribut
    String merek;
    String tipe;
    int harga;

    //constructor = method yang memiliki nama yang sama dengan class
    public SepedaMotor(){}

    //constructor dengan parameter
    public SepedaMotor(String merek, String tipe, int harga) {
        this.merek = merek;
        this.tipe = tipe;
        this.harga = harga;
    }

    public String getMerek() {
        return merek;
    }
    public void setMerek(String merek) {
        this.merek = merek;
    }
    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void showInfo(){
        System.out.println("Merek : " + merek);
        System.out.println("Tipe : " + tipe);
        System.out.println("Harga : " + harga);
        System.out.println();
    }
}
