package Praktikum07;
import java.util.Scanner;
public class DoWhileCuti20 {
    public static void main(String[] args) {
        
        int jatahCuti, jumlahHari;
        String konfirmasi;
        Scanner sc = new Scanner(System.in);

        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();

        do {
            System.out.println("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                    continue;
                    
                }
            } else {
                System.out.println("Anda tidak mengambil cuti");
                break;
            }
        } while (jatahCuti > 0);
            
    }
}
