/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117086.latihan37.objectorientedprogramrata.ratanilai;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 * NAMA                 : RD Muhammad Djulfikar BU
 * KELAS                : IF3
 * NIM                  : 10117086
 * DESKRIPSI PROGRAM    : Mencari Rata-rataNilai
 */
public class PBO310117086Latihan37ObjectOrientedProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rata rata = new Rata();
         Scanner scn = new Scanner(System.in);

         int n;
         System.out.print("Masukkan Banyaknya Mahasiswa : ");
         n = scn.nextInt();

         rata.HitungTotal(rata.nilaiMhs, n);
         rata.HitungRataRataNilaiMhs(rata.totalNilaiMhs, n);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : "+rata.HitungRataRataNilaiMhs(rata.totalNilaiMhs,n));
        System.out.println("Developed by : DJ BU");

    }
    
}
