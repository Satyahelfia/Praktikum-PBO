package com.satyahelfi.pbo.pertemuan4;

public class main {

    public static void main(String[] args){
        Manajer manajer = new Manajer();
        manajer.nip = 1975;
        manajer.nama = "Satya";

        manajer.showInfo();

        // Polimorfisme
        manajer.bonus();
        
        manajer.bonus(10000);

    }
}
