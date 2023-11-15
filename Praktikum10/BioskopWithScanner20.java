package Praktikum10;
import java.util.Scanner;
public class BioskopWithScanner20 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {

        System.out.println("Menu ");
        System.out.println("1.Input data penonton");
        System.out.println("2.Tampilkan daftar penonton");
        System.out.println("3.Exit");
        System.out.print("Pilih Menu: ");
        menu = sc.nextInt();

        if (menu == 1) {
            while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc.next();
            System.out.print("Masukkan baris: ");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();

           if(penonton[baris-1][kolom-1] == null) {
                penonton[baris-1][kolom-1] = nama;
           } 
           else {
            System.out.println("Mohon Masukkan kolom dan baris kembali");
           }
            
            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        } 
    }
        else if (menu == 2) {
             // Simbol pengganti untuk null
                String simbolPengganti = "***";
            for (int i = 0; i < penonton.length; i++) {
                for (int j = 0; j < penonton[i].length; j++) {
                    if (penonton[i][j] == null) {
                        penonton[i][j] = simbolPengganti;
                }
            }
                System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(",", penonton[i]));
               
            }
        }
        else if (menu == 3) {
            System.out.println("Program Berhenti");
            break;
        }
        }

    }
}
