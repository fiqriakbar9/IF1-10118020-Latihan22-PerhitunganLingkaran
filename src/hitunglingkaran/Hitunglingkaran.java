/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitunglingkaran;

import java.util.Scanner;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menampilkan hasil hitung
 * lingkaran dengan memasukan diameternya terlebih dahulu
 */
public class Hitunglingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a;
         double diameter;
         double r,l,k; // balidasi jari-jari, luas dan keliling
         Scanner rlk = new Scanner(System.in);
         
         System.out.println("======Perhitungan Lingkaran======");
         
       do {            
            System.out.print("Masukkan nilai diameter lingkaran : ");
            a = rlk.nextLine();
            //validasi input yang masuk
            System.out.println((!a.matches("[0-9]*"))
                    ?"Nilai Diameter Tidak Sesuai\n":"");

        } while (!a.matches("[0-9]*"));
         
         System.out.println("======Hasil Perhitungan Lingkaran======");
         diameter = Double.parseDouble(a);
         
         //proses hitung lingkaran
         r = diameter/2;
         System.out.printf("Jari-jari Lingkaran\t = %.0f cm %n",r);
         
         l = Math.PI*r*r;
         System.out.printf("Lulas Lingkaran\t\t = %.2f cm %n",l);
         
         k = 2*Math.PI*r;
         System.out.printf("Keliling Lingkaran\t = %.2f cm %n",k);
         
           System.out.println ("\nDevelop by : Fiqri Akbar Pratama");
    }
}
