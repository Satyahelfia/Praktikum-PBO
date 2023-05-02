package com.satyahelfi.pbo.pertemuan2;

import java.util.Scanner;
public class Unguided_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nama;
        int umur;
        String programStudi;

        System.out.println("== Program Form Pendaftaran Mahasiswa Baru ==");

        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        if(nama.isEmpty()){
            System.out.println("Nama tidak boleh kosong");
            return;
        }

        System.out.print("Masukkan Umur: ");
        umur = input.nextInt();
        if (umur < 17) {
            System.out.println("Umur anda belum cukup");
            return;
        }

        System.out.println("Pilih Jurusan: ");
        System.out.println("1. Teknik Informatika");
        System.out.println("2. Sistem Informasi");
        System.out.println("3. Rekayasa Perangkat Lunak");
        System.out.print("Masukkan Pilihan: ");
        int pilihan = input.nextInt();
        if (pilihan == 1) {
            programStudi = "Teknik Informatika";
        } else if (pilihan == 2) {
            programStudi = "Sistem Informasi";
        } else if (pilihan == 3) {
            programStudi = "Rekayasas Perangkat Lunak";
        } else {
            System.out.println("Error: Pilihan program studi tidak valid!");
            return;
        }
        System.out.println("== Data Pendaftaran ==");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Jurusan : " + programStudi);
        System.out.println("== Data Pendaftaran ==");
    }
}
