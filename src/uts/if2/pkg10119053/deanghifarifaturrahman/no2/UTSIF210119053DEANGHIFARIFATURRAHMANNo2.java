/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119053.deanghifarifaturrahman.no2;

import java.util.Scanner;
import model.Tabungan;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program tabungan
 */
public class UTSIF210119053DEANGHIFARIFATURRAHMANNo2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("====Program Penarikan Uang===");
        
        System.out.print("Masukkan saldo awal : ");
        int saldoAwal = input.nextInt();
        Tabungan tabungan = new Tabungan(saldoAwal);
        
        System.out.print("Jumlah uang yang diambil : ");
        int ambil = input.nextInt();
        
        System.out.print("Saldo anda sekarang : ");
        System.out.println(tabungan.ambilUang(ambil));
    }
    
}
