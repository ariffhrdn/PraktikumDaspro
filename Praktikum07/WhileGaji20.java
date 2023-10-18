package Praktikum07;
import java.util.Scanner;
public class WhileGaji20 {
    public static void main(String[] args) {
        
        int jumlahKaryawan, jumlahLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = scan.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan Jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = scan.next();
            System.out.print("Masukkan jumlah jam lembur: ");
            jumlahLembur = scan.nextInt();
             i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahLembur * 75000;            
            } else {
                System.out.println("Jabatan Invalid");
            }
           
            totalGajiLembur += gajiLembur;
        }

            System.out.println("Total gaji lembur: " + totalGajiLembur);
    }
}
