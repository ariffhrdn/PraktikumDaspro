package Praktikum09;
import java.util.Scanner;
public class ArrayNilai20 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int [10];
        int total = 0, tertinggi =0, terendah =100,jumlahLulus =0, jumlahTidakLulus =0;
        double rata;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir mahasiswa ke- " + (i+1) + ": ");
            nilaiAkhir[i] = sc.nextInt();

        if (nilaiAkhir[i] < terendah) {
            terendah = nilaiAkhir[i];
        } 
        else if (nilaiAkhir[i] > tertinggi) {
            tertinggi = nilaiAkhir[i];
        }  
        total += nilaiAkhir[i]; 
        }
        

        for (int i = 0; i < 10; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke- " + (i+1) + " lulus " ); 
                jumlahLulus++;
            }
            else {
                System.out.println("Mahasiswa ke- " + (i+1) + " tidak lulus " );
                jumlahTidakLulus++;
            }
        }
        rata = (double)total / nilaiAkhir.length;
        
        System.out.println("Nilai rata rata adalah: " + rata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah adalah: " + terendah);
        System.out.println("Jumlah Mahasiswa Lulus: " +jumlahLulus);
        System.out.println("Jumlah Mahasiswa Lulus: " +jumlahTidakLulus);
    }
}
