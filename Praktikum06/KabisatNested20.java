//package Praktikum06;
import java.util.Scanner;
public class KabisatNested20 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Tahun Kabisat: ");
        int tahun = sc.nextInt();
      

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0)
                System.out.println("Tahun Kabisat");

            else 
                System.out.println("Bukan Tahun Kabisat");    
        } else 
            System.out.println("Bukan Tahun Kabisat");
        
    }

}
