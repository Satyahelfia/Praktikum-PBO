package com.satyahelfi.pbo.Pertemuan3;

public class Main {
    public static void main(String[] args){
//        SepedaMotor suzuki = new SepedaMotor();
//        SepedaMotor yamaha = new SepedaMotor();
//        SepedaMotor honda = new SepedaMotor();
//
//        suzuki.merek = "Suzuki";
//        suzuki.tipe = "GSX 1000R";
//        suzuki.harga = 10000000;
//
//        yamaha.merek = "Yamaha";
//        yamaha.tipe = "Mio 150R";
//        yamaha.harga = 30000000;
//
//        honda.merek = "Honda";
//        honda.tipe = "Supra X";
//        honda.harga = 15000000;
//
//        suzuki.showInfo();
//        yamaha.showInfo();
//        honda.showInfo();

        //implementasi constractor
        SepedaMotor vespa = new SepedaMotor("Vespa", "Vespa Matic", 400000 );
//        vespa.showInfo();

        //sebelum perubahan
        System.out.println(
                "Motor Merek : " + vespa.getMerek() + "Dengan tipe (before) : " + vespa.getTipe()
        );

        //melakukan proses perubahan tipe motor
        vespa.setTipe("Sprint");

        //sesudah perubahan
        System.out.println(
                "Motor Merek : "+ vespa.getMerek() + "Dengan tipe (after) : " + vespa.getTipe()
          );

    }
}
